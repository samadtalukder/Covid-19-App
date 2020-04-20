package com.samad_talukder.covid_19.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samad_talukder.covid_19.R;
import com.samad_talukder.covid_19.model.CountriesStat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;

public class AdapterAllCountriesState extends RecyclerView.Adapter<AdapterAllCountriesState.AllCountriesStateViewHolder> implements Filterable {

    private Context context;
    private ArrayList<CountriesStat> countriesStatArrayList;

    public AdapterAllCountriesState(Context context) {
        this.context = context;
    }

    public void setCountriesStatArrayList(ArrayList<CountriesStat> countriesStatArrayList) {
        this.countriesStatArrayList = countriesStatArrayList;
        notifyDataSetChanged();
    }

    private Filter searchFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<CountriesStat> arrayList = new ArrayList<CountriesStat>();

            if (constraint == null || constraint.length() == 0) {
                arrayList.addAll(countriesStatArrayList);
            } else {
                String trim = constraint.toString().toLowerCase().trim();
                Timber.e("Trim: " + trim);
                for (CountriesStat countriesStat : countriesStatArrayList) {
                    if (countriesStat.getCountryName().toLowerCase().contains(trim)) {

                        arrayList.add(countriesStat);
                    }
                }

            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = arrayList;
            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            countriesStatArrayList.clear();
            countriesStatArrayList.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };

    @NonNull
    @Override
    public AllCountriesStateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_all_countries_states, parent, false);
        return new AllCountriesStateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllCountriesStateViewHolder holder, int position) {
        holder.bindData(position);
    }

    @Override
    public int getItemCount() {
        return countriesStatArrayList != null ? countriesStatArrayList.size() : 0;
    }

    @Override
    public Filter getFilter() {
        return searchFilter;
    }


    public class AllCountriesStateViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_country_name)
        TextView tvCountryName;

        @BindView(R.id.tv_total_infected)
        TextView tvTotalInfected;

        @BindView(R.id.tv_new_infected)
        TextView tvNewInfected;

        @BindView(R.id.tv_total_death)
        TextView tvTotalDeath;

        @BindView(R.id.tv_new_death)
        TextView tvNewDeath;

        @BindView(R.id.tv_total_recovered)
        TextView tvTotalRecovered;

        @BindView(R.id.tv_serious_critical)
        TextView tvSeriousCritical;

        @BindView(R.id.tv_death_per_1m)
        TextView tvDeathPer1m;

        @BindView(R.id.tv_infected_per_1m)
        TextView tvInfectedPer1m;

        @BindView(R.id.tv_total_tests)
        TextView tvTotalTests;

        @BindView(R.id.tv_total_tests_per_1m)
        TextView tvTotalTestsPer1m;

        public AllCountriesStateViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindData(int position) {
            CountriesStat countriesStats = countriesStatArrayList.get(position);

            String countryName = countriesStats.getCountryName();
            String newDeaths = countriesStats.getNewDeaths();
            String newInfected = countriesStats.getNewCases();
            String totalInfected = countriesStats.getCases();
            String totalDeaths = countriesStats.getDeaths();
            String totalRecovered = countriesStats.getTotalRecovered();
            String seriousCritical = countriesStats.getSeriousCritical();
            String deathsPer1mPopulation = countriesStats.getDeathsPer1mPopulation();
            String totalInfectedPer1mPopulation = countriesStats.getTotalCasesPer1mPopulation();
            String totalTests = countriesStats.getTotalTests();
            String totalTestPer1m = countriesStats.getTestsPer1mPopulation();

            tvCountryName.setText(countryName);
            tvNewDeath.setText(newDeaths);
            tvTotalDeath.setText(totalDeaths);
            tvNewInfected.setText(newInfected);
            tvTotalInfected.setText(totalInfected);
            tvTotalRecovered.setText(totalRecovered);
            tvSeriousCritical.setText(seriousCritical);
            tvDeathPer1m.setText(deathsPer1mPopulation);
            tvInfectedPer1m.setText(totalInfectedPer1mPopulation);
            tvTotalTests.setText(totalTests);
            tvTotalTestsPer1m.setText(totalTestPer1m);


        }
    }
}

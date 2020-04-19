package com.samad_talukder.covid_19.activities;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.samad_talukder.covid_19.R;
import com.samad_talukder.covid_19.model.WorldStateResponse;
import com.samad_talukder.covid_19.view_model.WorldStatViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tv_status_last_update)
    TextView tvStatusLastUpdate;

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

    @BindView(R.id.swipeRefresh)
    SwipeRefreshLayout swipeRefresh;

    @BindView(R.id.root)
    RelativeLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        WorldStatViewModel worldStatViewModel = ViewModelProviders.of(this).get(WorldStatViewModel.class);


        worldStatViewModel.getWorldStateLiveData().observe(this, new Observer<WorldStateResponse>() {
            @Override
            public void onChanged(WorldStateResponse worldStateResponse) {
                setGlobalData(worldStateResponse);
            }
        });


    }

    private void setGlobalData(WorldStateResponse worldStateResponse) {
        String newDeaths = worldStateResponse.getNewDeaths();
        String newInfected = worldStateResponse.getNewCases();
        String totalInfected = worldStateResponse.getTotalCases();
        String totalDeaths = worldStateResponse.getTotalDeaths();
        String totalRecovered = worldStateResponse.getTotalRecovered();
        String lastUpdate = worldStateResponse.getStatisticTakenAt();
        String seriousCritical = worldStateResponse.getSeriousCritical();
        String deathsPer1mPopulation = worldStateResponse.getDeathsPer1mPopulation();
        String totalCasesPer1mPopulation = worldStateResponse.getTotalCasesPer1mPopulation();

        tvTotalDeath.setText(totalDeaths);
        tvNewDeath.setText("(+"+newDeaths+")");
        tvTotalInfected.setText(totalInfected);
        tvNewInfected.setText("(+"+newInfected+")");
        tvStatusLastUpdate.setText(lastUpdate);
        tvTotalRecovered.setText(totalRecovered);
        tvSeriousCritical.setText(seriousCritical);
        tvDeathPer1m.setText(deathsPer1mPopulation);
        tvInfectedPer1m.setText(totalCasesPer1mPopulation);
    }
}

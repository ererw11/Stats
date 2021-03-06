package com.android.stats.player_stats.stats;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerStats {

    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("stats")
    @Expose
    private List<Stat> stats = null;

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public List<Stat> getStats() {
        return stats;
    }

    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

}

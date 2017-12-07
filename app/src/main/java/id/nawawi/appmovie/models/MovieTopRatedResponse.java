package id.nawawi.appmovie.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by nawaw on 12/7/2017.
 */

public class MovieTopRatedResponse {
    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<MovieTopRated> results;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<MovieTopRated> getResults() {
        return results;
    }

    public void setResults(List<MovieTopRated> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}

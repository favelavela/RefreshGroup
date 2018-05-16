package example.damian.code.refreshgroup.Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Andria TAE on 16/05/2018.
 */

public class CodeChallenges {

        @SerializedName("totalAuthored")
        @Expose
        private Integer totalAuthored;
        @SerializedName("totalCompleted")
        @Expose
        private Integer totalCompleted;

        public Integer getTotalAuthored() {
            return totalAuthored;
        }

        public void setTotalAuthored(Integer totalAuthored) {
            this.totalAuthored = totalAuthored;
        }

        public Integer getTotalCompleted() {
            return totalCompleted;
        }

        public void setTotalCompleted(Integer totalCompleted) {
            this.totalCompleted = totalCompleted;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this).append("totalAuthored", totalAuthored).append("totalCompleted", totalCompleted).toString();
        }

    }

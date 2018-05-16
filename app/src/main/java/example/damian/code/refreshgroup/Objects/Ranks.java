package example.damian.code.refreshgroup.Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Andria TAE on 16/05/2018.
 */

public class Ranks {

        @SerializedName("overall")
        @Expose
        private Overall overall;
        @SerializedName("languages")
        @Expose
        private Languages languages;

        public Overall getOverall() {
            return overall;
        }

        public void setOverall(Overall overall) {
            this.overall = overall;
        }

        public Languages getLanguages() {
            return languages;
        }

        public void setLanguages(Languages languages) {
            this.languages = languages;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this).append("overall", overall).append("languages", languages).toString();
        }

    }
}

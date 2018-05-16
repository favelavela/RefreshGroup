package example.damian.code.refreshgroup.Objects;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import example.damian.code.refreshgroup.Objects.CodeChallenges;
import example.damian.code.refreshgroup.Objects.Ranks;
import io.realm.RealmObject;


public class User_Container extends RealmObject {

        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("honor")
        @Expose
        private Integer honor;
        @SerializedName("clan")
        @Expose
        private String clan;
        @SerializedName("leaderboardPosition")
        @Expose
        private Integer leaderboardPosition;
        @SerializedName("skills")
        @Expose
        private List<String> skills = null;
        @SerializedName("ranks")
        @Expose
        private Ranks ranks;
        @SerializedName("codeChallenges")
        @Expose
        private CodeChallenges codeChallenges;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getHonor() {
            return honor;
        }

        public void setHonor(Integer honor) {
            this.honor = honor;
        }

        public String getClan() {
            return clan;
        }

        public void setClan(String clan) {
            this.clan = clan;
        }

        public Integer getLeaderboardPosition() {
            return leaderboardPosition;
        }

        public void setLeaderboardPosition(Integer leaderboardPosition) {
            this.leaderboardPosition = leaderboardPosition;
        }

        public List<String> getSkills() {
            return skills;
        }

        public void setSkills(List<String> skills) {
            this.skills = skills;
        }

        public Ranks getRanks() {
            return ranks;
        }

        public void setRanks(Ranks ranks) {
            this.ranks = ranks;
        }

        public CodeChallenges getCodeChallenges() {
            return codeChallenges;
        }

        public void setCodeChallenges(CodeChallenges codeChallenges) {
            this.codeChallenges = codeChallenges;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this).append("username", username).append("name", name).append("honor", honor).append("clan", clan).append("leaderboardPosition", leaderboardPosition).append("skills", skills).append("ranks", ranks).append("codeChallenges", codeChallenges).toString();
        }

    }


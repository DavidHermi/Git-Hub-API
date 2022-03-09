import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
      GitHub github = null ;

        try {
            github = new GitHubBuilder().withOAuthToken("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").build();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            GHRepository repo = github.createRepository(
                    "new-repository" ).create() ;
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

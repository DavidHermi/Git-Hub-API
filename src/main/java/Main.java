import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        GitHub github = null ;

        try {
            github = GitHubBuilder.fromPropertyFile("/home/dam1/Escritorio/token.properties").build();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            GHRepository repo = github.createRepository(
                    "new-repository3" ).create() ;
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    }




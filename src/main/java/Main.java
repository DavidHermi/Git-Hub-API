import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        GitHub github = null ;

        try {
            github = new GitHubBuilder().withOAuthToken(JOptionPane.showInputDialog("Inserte el token")).build();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            GHRepository repo = github.createRepository(
                    "new-repository2" ).create() ;
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    }




package guru.springframework.demo.service;

public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes=new ChuckNorrisQuotes();

    }

    @Override
    public String getJoke() {
        return null;
    }
}

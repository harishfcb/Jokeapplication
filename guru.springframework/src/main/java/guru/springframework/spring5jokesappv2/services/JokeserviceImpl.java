package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeserviceImpl implements Jokeservice {
    private final ChuckNorrisQuotes chuckNorrisQuotes;
    public JokeserviceImpl(){
        this.chuckNorrisQuotes=new ChuckNorrisQuotes();
    }
    @Override
    public String getjoke() {
        return chuckNorrisQuotes.getRandomQuote() ;
    }
}

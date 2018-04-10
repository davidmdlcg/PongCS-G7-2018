package com.mygdx.test.step;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.game.gameworld.GameWorld;

import org.junit.Assert;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.mockito.Mockito.when;


public class DisparoStep {

    private GameWorld gameWold = null;
    private int vidas;

    private void cambiarVidas(int vidas) throws IllegalAccessException, NoSuchFieldException {
        Field field = GameWorld.class.getDeclaredField("vida");
        field.setAccessible(true);
        field.setInt(gameWold, vidas);
    }

    @Before
    public void beforeScenario() {
        Gdx.gl20 = Mockito.mock(GL20.class);
        Gdx.gl = Gdx.gl20;
        Gdx.graphics = Mockito.mock(Graphics.class);
        when(Gdx.graphics.getWidth()).thenReturn(1440);
        when(Gdx.graphics.getHeight()).thenReturn(2560);
    }


    @Given("^tengo (\\d+) balas$")
    public void tengo_balas(int arg1) throws NoSuchFieldException, IllegalAccessException {
        // Write code here that turns the phrase above into concrete actions
        gameWold = new GameWorld();
        cambiarVidas(arg1);
    }

    @When("^pulso el boton de disparar$")
    public void pulso_el_boton_de_disparar() {
        // Write code here that turns the phrase above into concrete actions
        gameWold.disparo();
    }

    @Then("^me quedan (\\d+) balas$")
    public void me_quedan_balas(int arg1) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg1, gameWold.getVida());
    }

    @Given("^no me quedan balas por disparar$")
    public void no_me_quedan_balas_por_disparar() throws NoSuchFieldException, IllegalAccessException {
        // Write code here that turns the phrase above into concrete actions
        gameWold = new GameWorld();
        cambiarVidas(0);
    }

    @Then("^me aparece un mensaje indicando que he perdido$")
    public void me_aparece_un_mensaje_indicando_que_he_perdido() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}

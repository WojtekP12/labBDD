package edu.iis.mto.bdd.trains.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;
import org.joda.time.LocalTime;

public class ScenarioAutomation 
{
	@Zakładając("^, że chcę się dostać z (.*) do (.*)$")
	public void GivenRoute(String startLocation, String destination) throws Throwable
	{
        // Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
	
	@I("^następny pociąg odjeżdża o (.*) na linii (.*)$")
    public void givenDepartureTimeAndLine(@Transform(JodaLocalTimeConverter.class) LocalTime departure, String line) throws Throwable 
	{
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Gdy("^zapytam o godzinę przyjazdu$")
    public void askAboutArrivalTime() throws Throwable 
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu: (.*)$")
    public void getArrivalTimeApproximately(@Transform(JodaLocalTimeConverter.class) LocalTime arrival) throws Throwable 
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

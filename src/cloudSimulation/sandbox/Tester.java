package cloudSimulation.sandbox;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.jfree.ui.RefineryUtilities;
import org.xml.sax.SAXException;

import cloudSimulation.CloudUtils.CloudExample;
import cloudSimulation.GML2BRITE.GML2BRITE;
import cloudSimulation.GraphUtils.GraphML;
import cloudSimulation.MathUtils.Charter;
import javax.swing.JFrame;

public class Tester {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//graphTester();
		//cloudTester();
		//gmlBRTTester();
		//chartTester();
                guiTester();
	}
	
	
	private static void chartTester() {
		Charter charter = new Charter("Demo");
		charter.fetchWindow();
		RefineryUtilities.centerFrameOnScreen(charter);
		charter.setVisible(true);
	}



	private static void gmlBRTTester() throws IOException, SAXException {
		GML2BRITE gbr = new GML2BRITE();
		gbr.readIn("io/topology.graphml");
		System.out.println(gbr);
		
	}
	
	private static void cloudTester() {
		(new CloudExample()).go();
		
	}

	public static void graphTester() throws ParserConfigurationException, SAXException, IOException{
        	String filename = "io/sample.graphml";
            GraphML graph=new GraphML();
            graph.readIn(filename);
            graph.outConsole();
            
            final JFrame frame = new JFrame();
	    frame.setTitle("GraphMLReader for Trees - Reading in Attributes"); // Set the
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Give a close
            graph.drawGraph(frame.getContentPane());
            
            frame.pack();
            frame.setVisible(true);
		
	}

    private static void guiTester() throws ParserConfigurationException, SAXException, IOException {
                	String filename = "io/sample.graphml";
        SimFacade.getInstance().go();
    }

}



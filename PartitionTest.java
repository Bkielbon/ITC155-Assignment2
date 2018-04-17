import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class PartitionTest {


	@Test
	public void PartitionTest() {

		Partition test = new Partition();
		
		List<Integer>mainList= new LinkedList<Integer> ();
		mainList.add(15);
		
		assertTrue(mainList.contains(15));
		}

}
	

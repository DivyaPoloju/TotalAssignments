

import java.util.stream.Collectors;

public class FormatString {
	
	public static void main(String[] args)
	{
		FormatInterface fs= (s)->
		s.chars()
		.mapToObj(c -> (char) c + " ")
	    .collect(Collectors.joining())
	    .trim();
		
		System.out.println(fs.formatString("CG"));
	                
	}
	
	@FunctionalInterface
	public interface FormatInterface {
		
		public String formatString(String input);

	}


}

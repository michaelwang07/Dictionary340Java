import java.util.*;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.lang.String;


public class Assignment_2 {
	
enum Arrow
{
	NOUN("Arrow [noun] : Here is one arrow: <IMG> -=>> </IMG>");
	
	String str;
	Arrow(String s) { this.str = s; }
	public String get() { return str; }
};

enum Book
{
	NOUN0("Book [noun] : A set of pages."),
	NOUN1("Book [noun] : A written work published in printed or electronic form."),
	VERB0("Book [verb] : To arrange for someone to have a seat on a plane."),
	VERB1("Book [verb] : To arrange something on a particular date.");
	
	String str;
	Book(String s) { this.str = s; }
	public String get() { return str; }
};

enum Distinct
{
	ADJECTIVE0("Distinct [adjective] : Familiar. Worked in Java."),
	ADJECTIVE1("Distinct [adjective] : Unique. No duplicates. Clearly different or of a different kind."),
	ADVERB("Distinct [adverb] : Uniquely. Written \"distinctly\"."),
	NOUN0("Distinct [noun] : A keyword in this assignment."),
	NOUN1("Distinct [noun] : An advanced search option."),
	NOUN2("Distinct [noun] : Distinct is a parameter in this assignment.");
	
	String str;
	Distinct(String s) { this.str = s; }
	public String get() { return str; }
}

enum Placeholder
{
	ADJECTIVE("Placeholder [adjective] : To be updated..."),
	ADVERB("Placeholder [adverb] : To be updated..."),
	CONJUNCTION("Placeholder [conjunction] : To be updated..."),
	INTERJECTION("Placeholder [interjection] : To be updated..."),
	NOUN("Placeholder [noun] : To be updated..."),
	PREPOSITION("Placeholder [preposition] : To be updated..."),
	PRONOUN("Placeholder [pronoun] : To be updated..."),
	VERB("Placeholder [verb] : To be updated...");
	
	String str;
	Placeholder(String s) { this.str = s; }
	public String get() { return str; }
};

enum Reverse
{
	ADJECTIVE0("Reverse [adjective] : On back side."),
	ADJECTIVE1("Reverse [adjective] : Opposite to usual or previous arrangement."),
	NOUN0("Reverse [noun] : A dictionary program's parameter."),
	NOUN1("Reverse [noun] : Change to opposite direction."),
	NOUN2("Reverse [noun] : The opposite."),
	NOUN3("Reverse [noun] : To be updated..."),
	VERB0("Reverse [verb] : Change something to opposite."),
	VERB1("Reverse [verb] : Go back"),
	VERB2("Reverse [verb] : Revoke ruling."),
	VERB3("Reverse [verb] : To be updated..."),
	VERB4("Reverse [verb] : Turn something inside out.");
	
	
	String str;
	Reverse(String s) { this.str = s; }
	public String get() { return str; }
};

enum Help
{
	INSTRUCTION0("PARAMETER HOW-TO, please enter:"),
	INSTRUCTION1("1. A search key -then 2. An optional part of speech -then"),
	INSTRUCTION2("3. An optional 'distinct' -then 4. An optional 'reverse'");
	
	String str;
	Help(String s) { this.str = s; }
	public String get() { return str; }
};

enum Exit
{
	NOTFOUND("<NOT FOUND> To be considered for the next release. Thank you.");
	
	String str;
	Exit(String s) { this.str = s; }
	public String get() { return str; }
};
	

public static void main(String[] args) {
	
	List<String> arrow = new ArrayList<String>();
	arrow.add(Arrow.NOUN.str);
	
	List<String> arrownoun = new ArrayList<String>();
	arrownoun.add(Arrow.NOUN.str);
	
	List<String> book = new ArrayList<String>();
	Arrays.stream(Book.values()).forEach(value -> book.add(value.str));
	
	List<String> booknoun = new ArrayList<String>();
	booknoun.add(Book.NOUN0.str);
	booknoun.add(Book.NOUN1.str);

	List<String> bookverb = new ArrayList<String>();
	bookverb.add(Book.VERB0.str);
	bookverb.add(Book.VERB1.str);
	
	List<String> distinct = new ArrayList<String>();
	distinct.add(Distinct.ADJECTIVE0.str);
	distinct.add(Distinct.ADJECTIVE1.str);
	distinct.add(Distinct.ADVERB.str);
	distinct.add(Distinct.NOUN0.str);
	distinct.add(Distinct.NOUN0.str);
	distinct.add(Distinct.NOUN0.str);
	distinct.add(Distinct.NOUN1.str);
	distinct.add(Distinct.NOUN2.str);
	
	List<String> distinctadjective = new ArrayList<String>();
	distinctadjective.add(Distinct.ADJECTIVE0.str);
	distinctadjective.add(Distinct.ADJECTIVE1.str);
	
	List<String> distinctadverb = new ArrayList<String>();
	distinctadverb.add(Distinct.ADVERB.str);
	
	List<String> distinctnoun = new ArrayList<String>();
	distinctnoun.add(Distinct.NOUN0.str);
	distinctnoun.add(Distinct.NOUN0.str);
	distinctnoun.add(Distinct.NOUN0.str);
	distinctnoun.add(Distinct.NOUN1.str);
	distinctnoun.add(Distinct.NOUN2.str);
	
	List<String> placeholder = new ArrayList<String>();
	placeholder.add(Placeholder.ADJECTIVE.str);
	placeholder.add(Placeholder.ADJECTIVE.str);
	placeholder.add(Placeholder.ADVERB.str);
	placeholder.add(Placeholder.CONJUNCTION.str);
	placeholder.add(Placeholder.INTERJECTION.str);
	placeholder.add(Placeholder.NOUN.str);
	placeholder.add(Placeholder.NOUN.str);
	placeholder.add(Placeholder.NOUN.str);
	placeholder.add(Placeholder.PREPOSITION.str);
	placeholder.add(Placeholder.PRONOUN.str);
	placeholder.add(Placeholder.VERB.str);
	
	List<String> placeholderadjective = new ArrayList<String>();
	placeholderadjective.add(Placeholder.ADJECTIVE.str);
	placeholderadjective.add(Placeholder.ADJECTIVE.str);
	
	List<String> placeholderadverb = new ArrayList<String>();
	placeholderadverb.add(Placeholder.ADVERB.str);
	
	List<String> placeholderconjunction = new ArrayList<String>();
	placeholderconjunction.add(Placeholder.CONJUNCTION.str);
	
	List<String> placeholderinterjection = new ArrayList<String>();
	placeholderinterjection.add(Placeholder.INTERJECTION.str);
	
	List<String> placeholdernoun = new ArrayList<String>();
	placeholdernoun.add(Placeholder.NOUN.str);
	placeholdernoun.add(Placeholder.NOUN.str);
	placeholdernoun.add(Placeholder.NOUN.str);
	
	List<String> placeholderpreposition = new ArrayList<String>();
	placeholderpreposition.add(Placeholder.PREPOSITION.str);
	
	List<String> placeholderpronoun = new ArrayList<String>();
	placeholderpronoun.add(Placeholder.PRONOUN.str);
	
	List<String> placeholderverb = new ArrayList<String>();
	placeholderverb.add(Placeholder.VERB.str);
	
	List<String> reverse = new ArrayList<String>();
	reverse.add(Reverse.ADJECTIVE0.str);
	reverse.add(Reverse.ADJECTIVE1.str);
	reverse.add(Reverse.NOUN0.str);
	reverse.add(Reverse.NOUN1.str);
	reverse.add(Reverse.NOUN2.str);
	reverse.add(Reverse.NOUN3.str);
	reverse.add(Reverse.NOUN3.str);
	reverse.add(Reverse.NOUN3.str);
	reverse.add(Reverse.NOUN3.str);
	reverse.add(Reverse.VERB0.str);
	reverse.add(Reverse.VERB1.str);
	reverse.add(Reverse.VERB2.str);
	reverse.add(Reverse.VERB2.str);
	reverse.add(Reverse.VERB3.str);
	
	List<String> reverseadjective = new ArrayList<String>();
	reverseadjective.add(Reverse.ADJECTIVE0.str);
	reverseadjective.add(Reverse.ADJECTIVE1.str);
	
	List<String> reversenoun = new ArrayList<String>();
	reversenoun.add(Reverse.NOUN0.str);
	reversenoun.add(Reverse.NOUN1.str);
	reversenoun.add(Reverse.NOUN2.str);
	reversenoun.add(Reverse.NOUN3.str);
	reversenoun.add(Reverse.NOUN3.str);
	reversenoun.add(Reverse.NOUN3.str);
	reversenoun.add(Reverse.NOUN3.str);
	
	List<String> reverseverb = new ArrayList<String>();
	reverseverb.add(Reverse.VERB0.str);
	reverseverb.add(Reverse.VERB1.str);
	reverseverb.add(Reverse.VERB2.str);
	reverseverb.add(Reverse.VERB2.str);
	reverseverb.add(Reverse.VERB3.str);
	
	List<String> help = new ArrayList<String>();
	help.add(Help.INSTRUCTION0.str);
	help.add(Help.INSTRUCTION1.str);
	help.add(Help.INSTRUCTION2.str);
	
	List<String> exit = new ArrayList<String>();
	exit.add(Exit.NOTFOUND.str);
	
	
	Map<String, Object> dictionary = new HashMap<>();
	dictionary.put("arrow", arrow);
	dictionary.put("arrownoun", arrownoun);
	dictionary.put("book", book);
	dictionary.put("booknoun", booknoun);
	dictionary.put("bookverb", bookverb);
	dictionary.put("distinct", distinct);
	dictionary.put("distinctadjective", distinctadjective);
	dictionary.put("distinctadverb", distinctadverb);
	dictionary.put("distinctnoun", distinctnoun);
	dictionary.put("placeholder", placeholder);
	dictionary.put("placeholderadjective", placeholderadjective);
	dictionary.put("placeholderadverb", placeholderadverb);
	dictionary.put("placeholderconjunction", placeholderconjunction);
	dictionary.put("placeholderinterjection", placeholderinterjection);
	dictionary.put("placeholdernoun", placeholdernoun);
	dictionary.put("placeholderproposition", placeholderpreposition);
	dictionary.put("placeholderpronoun", placeholderpronoun);
	dictionary.put("placeholderverb", placeholderverb);
	dictionary.put("reverse", reverse);
	dictionary.put("reverseadjective", reverseadjective);
	dictionary.put("reversenoun", reversenoun);
	dictionary.put("reverseverb", reverseverb);
	dictionary.put("!help", help);
	dictionary.put("exit", exit);

	
	System.out.println("! Loading data...");
	System.out.println("! Loading completed...");
	System.out.println();
	System.out.println("===== DICTIONARY 340 JAVA =====");
	System.out.println("----- Keywords: 19");
	System.out.println("----- Definitions: 61");
	System.out.println("----- !Q to quit");
	System.out.println();

	/*
	Scanner scan = new Scanner(System.in);
	String Input = scan.nextLine();
	String[] arr = Input.split(" ");
	
	System.out.println(arr[0] + arr[1]);
	*/
	
	int count = 1;
	
	while(true) 
	{
	System.out.println("   |" );
	System.out.print("Search [" + count + "] :" + " " );
	
	Scanner scan = new Scanner(System.in);
	String Input = scan.nextLine();
	Input.toLowerCase();
	String[] arr = Input.toLowerCase().split(" ");
	
	System.out.println("   |" );
	
		if (arr.length == 1)
		{
		output(arr[0], null, null, dictionary);
		}
		else if (arr.length == 2 && arr[1].equals("distinct") || arr[1].equals("reverse"))
		{
			output(arr[0], arr[1], null, dictionary);
		}
		else if ( (arr.length > 1) && arr[1].equals("adjective") || arr[1].equals("adverb")
				|| arr[1].equals("conjunction") || arr[1].equals("interjection") 
				|| arr[1].equals("noun") || arr[1].equals("preposition")
				|| arr[1].equals("pronoun") || arr[1].equals("verb"))
				{
					if(arr.length == 2)
					{
						output(arr[0] + arr[1], null, null, dictionary);
					}
					else if(arr.length == 3)
					{
						output(arr[0] + arr[1], arr[2], null, dictionary);
					}
					else if(arr.length == 4)
					{
						output(arr[0] + arr[1], arr[2], arr[3], dictionary);
					}
				}
		
		else if(arr.length == 2)
		{
		System.out.println("   |" );
		System.out.println("<The entered 2nd parameter " + arr[1] + " is NOT a part of speech.>");
		System.out.println("<The entered 2nd parameter " + arr[1] + " is NOT 'distinct'.>");
		System.out.println("<The entered 2nd parameter " + arr[1] + " is NOT 'reverse'.>");
		System.out.println("<The entered 2nd parameter " + arr[1] + " was disregarded.>");
		System.out.println("<The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>");
		System.out.println("   |" );
		output(arr[0], null, null, dictionary);
		}
		else if (arr.length == 3 && arr[1].equals("distinct") || arr[1].equals("reverse"))
		{
			output(arr[0], arr[1], arr[2], dictionary);
		}
		else if (arr.length == 3)
		{
		output(arr[0] + arr[1], arr[2], null, dictionary);
		}
		else if (arr.length == 4 && arr[1].equals("distinct") || arr[1].equals("reverse"))
		{
			output(arr[0], arr[1], arr[2], dictionary);
		}
		else if (arr.length == 4)
		{
		output(arr[0] + arr[1], arr[2], arr[3], dictionary);
		}
		else 
		{
		System.out.println("Exceeded four entries, please enter four or less entries");
		}
	
	count++;
	}
}

public static void output(String search, String arg2, String arg3, Map dictionary)
{
	List<String> Definition = null;
	List<String> Distinct = null;

	
	if (search.equals("q") || search.equals("!q") || search.equals("quit"))
	{
		System.out.println();
		System.out.println("-----THANK YOU-----");
		System.exit(0);
	}
	else if (search.equals("") || search.equals("!help"))
	{
		Definition = (List<String>) dictionary.get("!help");
		Definition.stream().forEach(s -> {
		System.out.println(s);	});
	}
	else if (dictionary.containsKey(search))
	{
		Definition = (List<String>) dictionary.get(search);
		if (arg2 == null)
		{
		Definition.stream().forEach(s -> {
		System.out.println(s);	});
		}
	}
	else
	{
		Definition = (List<String>) dictionary.get("exit");
		Definition.stream().forEach(s -> {
		System.out.println(s);	});
		//System.out.println("<NOT FOUND> To be considered for the next release. Thank you.");	
	}
	
	
	if (arg2 != null && arg2.equals("distinct") && arg3 == null)
	{
		Distinct = Definition.stream().distinct().collect(Collectors.toList());
		
		Distinct.stream().forEach(s -> {
		System.out.println(s);	});
	}
	else if (arg2 != null && arg2.equals("reverse") && arg3 == null)
	{
		List<String> Reversed = ImmutableList.copyOf(Definition).reverse();
		
		Reversed.stream().forEach(s -> {
		System.out.println(s);	});
	}
	else if(arg2 != null && arg3 == null)
	{
		System.out.println("   |" );
		System.out.println("<The entered 3rd parameter " + arg2 + " is NOT 'distinct'.>");
		System.out.println("<The entered 3rd parameter " + arg2 + " is NOT 'reverse'.>");
		System.out.println("<The entered 3rd parameter " + arg2 + " was disregarded.>");
		System.out.println("<The 3nd parameter should be 'distinct' or 'reverse'.>");
		System.out.println("   |" );
		
		Definition.stream().forEach(s -> {
		System.out.println(s);	});	
	}
	
	if (arg2 != null && arg3 != null && arg2.equals("distinct") && arg3.equals("reverse"))
	{
		Distinct = Definition.stream().distinct().collect(Collectors.toList());
		
		List<String> Reversed = ImmutableList.copyOf(Distinct).reverse();
		
		Reversed.stream().forEach(s -> {
		System.out.println(s);	});
	}
	else if (arg2 != null && arg3 != null && !arg3.equals("reverse") && arg2.equals("distinct"))
	{
		System.out.println("   |" );
		System.out.println("<The entered 4th parameter " + arg3 + " is NOT 'reverse'.>");
		System.out.println("<The entered 4th parameter " + arg3 + " was disregarded.>");
		System.out.println("<The 4th parameter should be 'reverse'.>");
		System.out.println("   |" );
		
		Distinct = Definition.stream().distinct().collect(Collectors.toList());
		
		Distinct.stream().forEach(s -> {
		System.out.println(s);	});
	}
	else if (arg2 != null && arg3 != null && !arg3.equals("reverse") && arg2.equals("reverse"))
	{
		System.out.println("   |" );
		System.out.println("<The entered 4th parameter " + arg3 + " is NOT 'reverse'.>");
		System.out.println("<The entered 4th parameter " + arg3 + " was disregarded.>");
		System.out.println("<The 4th parameter should be 'reverse'.>");
		System.out.println("   |" );
		
		List<String> Reversed = ImmutableList.copyOf(Definition).reverse();
		
		Reversed.stream().forEach(s -> {
		System.out.println(s);	});
	}
	else if (arg3 != null && !arg3.equals("reverse"))
	{
		System.out.println("   |" );
		System.out.println("<The entered 3rd parameter " + arg2 + " is NOT 'distinct'.>");
		System.out.println("<The entered 3rd parameter " + arg2 + " is NOT 'reverse'.>");
		System.out.println("<The entered 3rd parameter " + arg2 + " was disregarded.>");
		System.out.println("<The 3nd parameter should be 'distinct' or 'reverse'.>");
		System.out.println("   |" );
		System.out.println("<The entered 4th parameter " + arg3 + " is NOT 'reverse'.>");
		System.out.println("<The entered 4th parameter " + arg3 + " was disregarded.>");
		System.out.println("<The 4th parameter should be 'reverse'.>");
		System.out.println("   |" );
		
		Definition.stream().forEach(s -> {
		System.out.println(s);	});
	}
	
}
}
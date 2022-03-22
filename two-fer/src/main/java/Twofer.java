public class Twofer {
    public String twofer(String name) {
        if(name==null)
        {
            return "One for you, one for me.";
        }
        else
        {
            String s ="One for"+name+", one for me.";
            return s;
        }
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}

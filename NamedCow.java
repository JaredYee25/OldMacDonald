class NamedCow extends Cow
{
    protected String myName;
    public NamedCow(String name, String type, String sound)
    {
        myName = name;
        mySound = sound;
        myType = type;
    }
    public String getName()
    {
        return myName;
    }
}

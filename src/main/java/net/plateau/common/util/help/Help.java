package net.plateau.common.util.help;

public class Help
{
    public static void print()
    {
        System.out.println("""
                        net.plateau.common.util.help:
                            net.plateau.common.util.help.Help:
                                help ----------------------: print this,
                                run -----------------------: launch a version,
                                cd ------------------------: choose .minecraft folder directory,
                                config --------------------: change Plateau configs(minecraft dir...),
                                exit ----------------------: exit Plateau Launcher,
                        """);
    }
}

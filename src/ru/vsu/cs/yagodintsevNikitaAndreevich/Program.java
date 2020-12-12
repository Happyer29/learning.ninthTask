package ru.vsu.cs.yagodintsevNikitaAndreevich;

import ru.vsu.cs.util.ArrayUtils;


public class Program {

    public static void main(String[] args) throws Exception {
        if(args[0] != null){
            if(args[0] == "swing"){
//                Locale.setDefault(Locale.ROOT);
//                //SwingUtils.setLookAndFeelByName("Windows");
//                //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//                SwingUtils.setDefaultFont("Microsoft Sans Serif", 18);
//
//                /* Create and display the form */
//                java.awt.EventQueue.invokeLater(new Runnable() {
//                    public void run() {
//                        new FrameMain().setVisible(true);
//                    }
//                });
            }
            else if(args[0] == "console"){
                int[] input1 = ArrayUtils.readIntArrayFromFile(args[0]);
                int[] input2 = ArrayUtils.readIntArrayFromFile(args[1]);
                String outFile = args[2];
                int[] res = Task.Process(input1, input2);
                ArrayUtils.writeArrayToFile(outFile, res);
            }
        }

    }
}

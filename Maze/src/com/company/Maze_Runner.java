package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import static java.lang.System.exit;

public class Maze_Runner implements ActionListener {

    JToggleButton dfsOption = new JToggleButton("Solve by finding any route.");
    JToggleButton bfsOption = new JToggleButton("Solve by finding the fastest route.");
    JButton start = new JButton("START");
    JButton restart = new JButton("RESTART");
    JButton exit = new JButton("EXIT");
    JButton howToPlay = new JButton("How To Play");
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button9 = new JButton();
    JButton button8 = new JButton();
    JButton button10 = new JButton();
    JButton button11 = new JButton();
    JButton button12 = new JButton();
    JButton button13 = new JButton();
    JButton button14 = new JButton();
    JButton button15 = new JButton();
    JButton button16 = new JButton();
    JButton button17 = new JButton();
    JButton button18 = new JButton();
    JButton button19 = new JButton();
    JButton button20 = new JButton();
    JButton button21 = new JButton();
    JButton button22 = new JButton();
    JButton button23 = new JButton();
    JButton button24 = new JButton();
    JButton button25 = new JButton();
    JButton button26 = new JButton();
    JButton button27 = new JButton();
    JButton button28 = new JButton();
    JButton button29 = new JButton();
    JButton button30 = new JButton();
    JButton button31 = new JButton();
    JButton button32 = new JButton();
    JButton button33 = new JButton();
    JButton button34 = new JButton();
    JButton button35 = new JButton();
    JButton button36 = new JButton();
    JButton button37 = new JButton();
    JButton button38 = new JButton();
    JButton button39 = new JButton();
    JButton button40 = new JButton();
    JButton button41 = new JButton();
    JButton button42 = new JButton();
    JButton button43 = new JButton();
    JButton button44 = new JButton();
    JButton button45 = new JButton();
    JButton button46 = new JButton();
    JButton button47 = new JButton();
    JButton button49 = new JButton();
    JButton button48 = new JButton();
    JButton button50 = new JButton();
    JButton button51 = new JButton();
    JButton button52 = new JButton();
    JButton button53 = new JButton();
    JButton button54 = new JButton();
    JButton button55 = new JButton();
    JButton button56 = new JButton();
    JButton button57 = new JButton();
    JButton button58 = new JButton();
    JButton button59 = new JButton();
    JButton button60 = new JButton();
    JButton button61 = new JButton();
    JButton button62 = new JButton();
    JButton button63 = new JButton();
    JButton button64 = new JButton();
    JButton button65 = new JButton();
    JButton button66 = new JButton();
    JButton button67 = new JButton();
    JButton button69 = new JButton();
    JButton button68 = new JButton();
    JButton button70 = new JButton();
    JButton button71 = new JButton();
    JButton button72 = new JButton();
    JButton button73 = new JButton();
    JButton button74 = new JButton();
    JButton button75 = new JButton();
    JButton button76 = new JButton();
    JButton button77 = new JButton();
    JButton button79 = new JButton();
    JButton button78 = new JButton();
    JButton button80 = new JButton();
    JButton button81 = new JButton();
    JButton button82 = new JButton();
    JButton button83 = new JButton();
    JButton button84 = new JButton();
    JButton button85 = new JButton();
    JButton button86 = new JButton();
    JButton button87 = new JButton();
    JButton button89 = new JButton();
    JButton button88 = new JButton();
    JButton button90 = new JButton();
    JButton button91 = new JButton();
    JButton button92 = new JButton();
    JButton button93 = new JButton();
    JButton button94 = new JButton();
    JButton button95 = new JButton();
    JButton button96 = new JButton();
    JButton button97 = new JButton();
    JButton button98 = new JButton();
    JButton button99 = new JButton();
    JButton button100 = new JButton();

    JFrame frame = new JFrame("Maze Runner - Board");
    JFrame frame2 = new JFrame("Maze Runner");
    JFrame f = new JFrame("How To Play");
    JPanel panel = new JPanel();
    JPanel panelH = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel how2PlayPanel = new JPanel();
    JLabel label = new JLabel();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel label6 = new JLabel();
    JLabel label7 = new JLabel();
    JLabel label8 = new JLabel();
    JLabel labelby = new JLabel();
    JLabel labelAuthor = new JLabel();
    JLabel labelOfPrograme = new JLabel();
    JLabel labelXtra = new JLabel();
    JLabel resultText = new JLabel();
    JTextArea tt = new JTextArea();

    public Stack<Integer> dfs = new Stack<Integer>();
    public Queue<Integer> bfs = new LinkedList<Integer>();
    public boolean bfsDriver = false;
    public boolean dfsDriver = false;
    public boolean driverMsgCheck = false;
    public boolean[] array = new boolean[100];
    public int[] parent = new int[100];
    public int[] distance;
    public HashMap<String, JButton> mapmap = new HashMap<String, JButton>();
    public ArrayList<Integer>[] graphing;
    public int count = 0;
    public int result = 0;
    public int startPoint;
    public int endPoint;
    public boolean startpointCheck;
    public boolean endpointCheck;
    public final String gray = "java.awt.Color[r=128,g=128,b=128]";
    public final String orange = "java.awt.Color[r=255,g=200,b=0]";
    public static String blue = "java.awt.Color[r=0,g=0,b=255]";
    public final String dfltColor ="rmask=ff0000 gmask=ff00 bmask=ff amask=0" ;
    public final String divider = "|-----------------------------------------------------------------------------------------------------|";
    public final String startmsg = "|                               Please Select Your Starting Point                                    |";
    public final String endmsg = "|                                Please Select Your Ending Point                                     |";
    public final String wallmsg = "|                                              Please Select Your wall                                       |";
    public final String selectMsg = "|                            Please select one or both solving method.                        |";
    public final String errorSelectMsg = "|  You have not selected any solving method. Please select one or both. |";
    public final String colorBlockDetails = "|           BFS = Blue Path; DFS = Orange Path; Common Path =  Gray        |";
    public static boolean h2pc = false;

    public void buttons(JPanel panel) {
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(button11);
        panel.add(button12);
        panel.add(button13);
        panel.add(button14);
        panel.add(button15);
        panel.add(button16);
        panel.add(button17);
        panel.add(button18);
        panel.add(button19);
        panel.add(button20);
        panel.add(button21);
        panel.add(button22);
        panel.add(button23);
        panel.add(button24);
        panel.add(button25);
        panel.add(button26);
        panel.add(button27);
        panel.add(button28);
        panel.add(button29);
        panel.add(button30);
        panel.add(button31);
        panel.add(button32);
        panel.add(button33);
        panel.add(button34);
        panel.add(button35);
        panel.add(button36);
        panel.add(button37);
        panel.add(button38);
        panel.add(button39);
        panel.add(button40);
        panel.add(button41);
        panel.add(button42);
        panel.add(button43);
        panel.add(button44);
        panel.add(button45);
        panel.add(button46);
        panel.add(button47);
        panel.add(button48);
        panel.add(button49);
        panel.add(button50);
        panel.add(button51);
        panel.add(button52);
        panel.add(button53);
        panel.add(button54);
        panel.add(button55);
        panel.add(button56);
        panel.add(button57);
        panel.add(button58);
        panel.add(button59);
        panel.add(button60);
        panel.add(button61);
        panel.add(button62);
        panel.add(button63);
        panel.add(button64);
        panel.add(button65);
        panel.add(button66);
        panel.add(button67);
        panel.add(button68);
        panel.add(button69);
        panel.add(button70);
        panel.add(button71);
        panel.add(button72);
        panel.add(button73);
        panel.add(button74);
        panel.add(button75);
        panel.add(button76);
        panel.add(button77);
        panel.add(button78);
        panel.add(button79);
        panel.add(button80);
        panel.add(button81);
        panel.add(button82);
        panel.add(button83);
        panel.add(button84);
        panel.add(button85);
        panel.add(button86);
        panel.add(button87);
        panel.add(button88);
        panel.add(button89);
        panel.add(button90);
        panel.add(button91);
        panel.add(button92);
        panel.add(button93);
        panel.add(button94);
        panel.add(button95);
        panel.add(button96);
        panel.add(button97);
        panel.add(button98);
        panel.add(button99);
        panel.add(button100);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);
        button16.addActionListener(this);
        button17.addActionListener(this);
        button18.addActionListener(this);
        button19.addActionListener(this);
        button20.addActionListener(this);
        button21.addActionListener(this);
        button22.addActionListener(this);
        button23.addActionListener(this);
        button24.addActionListener(this);
        button25.addActionListener(this);
        button26.addActionListener(this);
        button27.addActionListener(this);
        button28.addActionListener(this);
        button29.addActionListener(this);
        button30.addActionListener(this);
        button31.addActionListener(this);
        button32.addActionListener(this);
        button33.addActionListener(this);
        button34.addActionListener(this);
        button35.addActionListener(this);
        button36.addActionListener(this);
        button37.addActionListener(this);
        button38.addActionListener(this);
        button39.addActionListener(this);
        button40.addActionListener(this);
        button41.addActionListener(this);
        button42.addActionListener(this);
        button43.addActionListener(this);
        button44.addActionListener(this);
        button45.addActionListener(this);
        button46.addActionListener(this);
        button47.addActionListener(this);
        button48.addActionListener(this);
        button49.addActionListener(this);
        button50.addActionListener(this);
        button51.addActionListener(this);
        button52.addActionListener(this);
        button53.addActionListener(this);
        button54.addActionListener(this);
        button55.addActionListener(this);
        button56.addActionListener(this);
        button57.addActionListener(this);
        button58.addActionListener(this);
        button59.addActionListener(this);
        button60.addActionListener(this);
        button61.addActionListener(this);
        button62.addActionListener(this);
        button63.addActionListener(this);
        button64.addActionListener(this);
        button65.addActionListener(this);
        button66.addActionListener(this);
        button67.addActionListener(this);
        button68.addActionListener(this);
        button69.addActionListener(this);
        button70.addActionListener(this);
        button71.addActionListener(this);
        button72.addActionListener(this);
        button73.addActionListener(this);
        button74.addActionListener(this);
        button75.addActionListener(this);
        button76.addActionListener(this);
        button77.addActionListener(this);
        button78.addActionListener(this);
        button79.addActionListener(this);
        button80.addActionListener(this);
        button81.addActionListener(this);
        button82.addActionListener(this);
        button83.addActionListener(this);
        button84.addActionListener(this);
        button85.addActionListener(this);
        button86.addActionListener(this);
        button87.addActionListener(this);
        button88.addActionListener(this);
        button89.addActionListener(this);
        button90.addActionListener(this);
        button91.addActionListener(this);
        button92.addActionListener(this);
        button93.addActionListener(this);
        button94.addActionListener(this);
        button95.addActionListener(this);
        button96.addActionListener(this);
        button97.addActionListener(this);
        button98.addActionListener(this);
        button99.addActionListener(this);
        button100.addActionListener(this);
        start.addActionListener(this);
        exit.addActionListener(this);
        restart.addActionListener(this);
        howToPlay.addActionListener(this);
//        howToPlay.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//            	how2play();
//            }
//        });

        bfsOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bfsDriver = !bfsDriver;
                driverMsgCheck = true;
                mainMenu();
            }
        });
        dfsOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dfsDriver = !dfsDriver;
                driverMsgCheck = true;
                mainMenu();
            }
        });


        button1.setName("1");
        button2.setName("2");
        button3.setName("3");
        button4.setName("4");
        button5.setName("5");
        button6.setName("6");
        button7.setName("7");
        button8.setName("8");
        button9.setName("9");
        button10.setName("10");
        button11.setName("11");
        button12.setName("12");
        button13.setName("13");
        button14.setName("14");
        button15.setName("15");
        button16.setName("16");
        button17.setName("17");
        button18.setName("18");
        button19.setName("19");
        button20.setName("20");
        button21.setName("21");
        button22.setName("22");
        button23.setName("23");
        button24.setName("24");
        button25.setName("25");
        button26.setName("26");
        button27.setName("27");
        button28.setName("28");
        button29.setName("29");
        button30.setName("30");
        button31.setName("31");
        button32.setName("32");
        button33.setName("33");
        button34.setName("34");
        button35.setName("35");
        button36.setName("36");
        button37.setName("37");
        button38.setName("38");
        button39.setName("39");
        button40.setName("40");
        button41.setName("41");
        button42.setName("42");
        button43.setName("43");
        button44.setName("44");
        button45.setName("45");
        button46.setName("46");
        button47.setName("47");
        button48.setName("48");
        button49.setName("49");
        button50.setName("50");
        button51.setName("51");
        button52.setName("52");
        button53.setName("53");
        button54.setName("54");
        button55.setName("55");
        button56.setName("56");
        button57.setName("57");
        button58.setName("58");
        button59.setName("59");
        button60.setName("60");
        button61.setName("61");
        button62.setName("62");
        button63.setName("63");
        button64.setName("64");
        button65.setName("65");
        button66.setName("66");
        button67.setName("67");
        button68.setName("68");
        button69.setName("69");
        button70.setName("70");
        button71.setName("71");
        button72.setName("72");
        button73.setName("73");
        button74.setName("74");
        button75.setName("75");
        button76.setName("76");
        button77.setName("77");
        button78.setName("78");
        button79.setName("79");
        button80.setName("80");
        button81.setName("81");
        button82.setName("82");
        button83.setName("83");
        button84.setName("84");
        button85.setName("85");
        button86.setName("86");
        button87.setName("87");
        button88.setName("88");
        button89.setName("89");
        button90.setName("90");
        button91.setName("91");
        button92.setName("92");
        button93.setName("93");
        button94.setName("94");
        button95.setName("95");
        button96.setName("96");
        button97.setName("97");
        button98.setName("98");
        button99.setName("99");
        button100.setName("100");
        start.setName("start");
        exit.setName("exit");
        restart.setName("restart");
        bfsOption.setName("bfs");
        dfsOption.setName("dfs");
        howToPlay.setName("how to play");

        mapmap.put(button1.getName(), button1);
        mapmap.put(button2.getName(), button2);
        mapmap.put(button3.getName(), button3);
        mapmap.put(button4.getName(), button4);
        mapmap.put(button5.getName(), button5);
        mapmap.put(button6.getName(), button6);
        mapmap.put(button7.getName(), button7);
        mapmap.put(button8.getName(), button8);
        mapmap.put(button9.getName(), button9);
        mapmap.put(button10.getName(), button10);
        mapmap.put(button11.getName(), button11);
        mapmap.put(button12.getName(), button12);
        mapmap.put(button13.getName(), button13);
        mapmap.put(button14.getName(), button14);
        mapmap.put(button15.getName(), button15);
        mapmap.put(button16.getName(), button16);
        mapmap.put(button17.getName(), button17);
        mapmap.put(button18.getName(), button18);
        mapmap.put(button19.getName(), button19);
        mapmap.put(button20.getName(), button20);
        mapmap.put(button21.getName(), button21);
        mapmap.put(button22.getName(), button22);
        mapmap.put(button23.getName(), button23);
        mapmap.put(button24.getName(), button24);
        mapmap.put(button25.getName(), button25);
        mapmap.put(button26.getName(), button26);
        mapmap.put(button27.getName(), button27);
        mapmap.put(button28.getName(), button28);
        mapmap.put(button29.getName(), button29);
        mapmap.put(button30.getName(), button30);
        mapmap.put(button31.getName(), button31);
        mapmap.put(button32.getName(), button32);
        mapmap.put(button33.getName(), button33);
        mapmap.put(button34.getName(), button34);
        mapmap.put(button35.getName(), button35);
        mapmap.put(button36.getName(), button36);
        mapmap.put(button37.getName(), button37);
        mapmap.put(button38.getName(), button38);
        mapmap.put(button39.getName(), button39);
        mapmap.put(button40.getName(), button40);
        mapmap.put(button41.getName(), button41);
        mapmap.put(button42.getName(), button42);
        mapmap.put(button43.getName(), button43);
        mapmap.put(button44.getName(), button44);
        mapmap.put(button45.getName(), button45);
        mapmap.put(button46.getName(), button46);
        mapmap.put(button47.getName(), button47);
        mapmap.put(button48.getName(), button48);
        mapmap.put(button49.getName(), button49);
        mapmap.put(button50.getName(), button50);
        mapmap.put(button51.getName(), button51);
        mapmap.put(button52.getName(), button52);
        mapmap.put(button53.getName(), button53);
        mapmap.put(button54.getName(), button54);
        mapmap.put(button55.getName(), button55);
        mapmap.put(button56.getName(), button56);
        mapmap.put(button57.getName(), button57);
        mapmap.put(button58.getName(), button58);
        mapmap.put(button59.getName(), button59);
        mapmap.put(button60.getName(), button60);
        mapmap.put(button61.getName(), button61);
        mapmap.put(button62.getName(), button62);
        mapmap.put(button63.getName(), button63);
        mapmap.put(button64.getName(), button64);
        mapmap.put(button65.getName(), button65);
        mapmap.put(button66.getName(), button66);
        mapmap.put(button67.getName(), button67);
        mapmap.put(button68.getName(), button68);
        mapmap.put(button69.getName(), button69);
        mapmap.put(button70.getName(), button70);
        mapmap.put(button71.getName(), button71);
        mapmap.put(button72.getName(), button72);
        mapmap.put(button73.getName(), button73);
        mapmap.put(button74.getName(), button74);
        mapmap.put(button75.getName(), button75);
        mapmap.put(button76.getName(), button76);
        mapmap.put(button77.getName(), button77);
        mapmap.put(button78.getName(), button78);
        mapmap.put(button79.getName(), button79);
        mapmap.put(button80.getName(), button80);
        mapmap.put(button81.getName(), button81);
        mapmap.put(button82.getName(), button82);
        mapmap.put(button83.getName(), button83);
        mapmap.put(button84.getName(), button84);
        mapmap.put(button85.getName(), button85);
        mapmap.put(button86.getName(), button86);
        mapmap.put(button87.getName(), button87);
        mapmap.put(button88.getName(), button88);
        mapmap.put(button89.getName(), button89);
        mapmap.put(button90.getName(), button90);
        mapmap.put(button91.getName(), button91);
        mapmap.put(button92.getName(), button92);
        mapmap.put(button93.getName(), button93);
        mapmap.put(button94.getName(), button94);
        mapmap.put(button95.getName(), button95);
        mapmap.put(button96.getName(), button96);
        mapmap.put(button97.getName(), button97);
        mapmap.put(button98.getName(), button98);
        mapmap.put(button99.getName(), button99);
        mapmap.put(button100.getName(), button100);


    }

    public void mainMenu() {
        panelH.setLayout(new GridLayout(20, 1, 1, 1));
        label.setText("                                       WELCOME TO--");
        labelOfPrograme.setText("                                                  MAZE RUNNER");
        labelby.setText("                                                         --programmed and designed by:");
        labelAuthor.setText("                                                                                    K.M. Abdullah Al Maruf");
        label1.setText(divider);
        label2.setText("|    Yellow = Start Point;  Red = End Point;  Black = Wall;  White = Path    |");
        label3.setText(divider);
        labelXtra.setText(colorBlockDetails);
        label4.setText(divider);
        if (!startpointCheck)
            label5.setText(startmsg);
        else if (!endpointCheck)
            label5.setText(endmsg);
        else
            label5.setText(wallmsg);
        label6.setText(divider);
        if (!bfsDriver && !dfsDriver && driverMsgCheck)
            label7.setText(errorSelectMsg);
        else
            label7.setText(selectMsg);

        label8.setText(divider);



        panelH.add(label);
        panelH.add(labelOfPrograme);
        panelH.add(labelby);
        panelH.add(labelAuthor);
        panelH.add(label1);
        panelH.add(label2);
        panelH.add(label3);
        panelH.add(label4);
        panelH.add(label4);
        panelH.add(labelXtra);
        panelH.add(label4);
        panelH.add(label4);
        panelH.add(label5);
        panelH.add(label6);
        panelH.add(label7);
        panelH.add(label8);

        panelH.add(dfsOption);
        panelH.add(bfsOption);
        panelH.add(start);
        panelH.add(restart);
        panelH.add(howToPlay);
        panelH.add(exit);
        if(result == 1)
        {
            resultText.setText("                                   DONE SOLVING THE MAZE. ^_^ ");
            panelH.add(resultText);
        }
        else if (result == -1)
        {
            resultText.setText("             The starting point is not connected with the ending point :( ");
            panelH.add(resultText);
        }
        else
        {
            resultText.setText("                                            Result will be shown here :) ");
            panelH.add(resultText);
        }

        panel2.add(panelH);
        frame2.add(panel2);
        frame2.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame2.setSize(750, 750);
        frame2.setVisible(true);
    }

    public void how2play()
    {

        how2PlayPanel.setLayout(new GridLayout(1,1,1,1));
        String ss = "  Instructions:\n  1) click on the buttons(the platforms) of Maze Runner - Board. Look for the next instruction on the Maze Runner window. \n      There will be shown what you need to select now and for what purpose. For playing, at first you need to select your starting point.\n      When you will select the square grid(button) will turn yellow means it is selected as your starting point. \n  2)Then you will be asked to select your ending point. When you will select a grid it will turn into red marking it as your ending point. \n  3) Now you need to select your walls to represent the maze's walls. Note that it is not mandatory to choose walls. You can play it\n      just by selecting your starting and ending point. \n  4) Now you need to choose which one of the algorithm between BFS or DFS you want to use to solve the maze. Note that you can use \n      both at the same time just by selecting both of then and clicking start.\n  5) After pressing start the result will be shown in both the windows. In the board window the path or the grid from your starting to ending\n      point will be highlighted. \n  6) Blue = represents BFS path or the shortest path inorder to solve the maze. \n      Orange = represents DFS path or random path to solve the maze. \n      Gray = represents the common path between BFS(Blue) and DFS (Orange).\n\n\n    **** Thank you very much for reading and trying out my project. it is my 2nd and 1st main project. So, there are many bugs and you \r\n" +
                "          may face problems. Please fell free to contact me and any kinf of point of view and advised are wholeheartedly welcomed. \r\n" +
                "          Thank you again ^_^  , Arigatou gozaimashita XD XD\r\n" +
                "\r\n" +
                "\r\n" +
                "\r\n" +
                "                                                                                        -------------------------->>>>>> K.M. Abdullah Al Maruf" ;
        tt.setText(ss);
        how2PlayPanel.add(tt);
        f.add(how2PlayPanel);
        f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
        f.setSize(750,750);
        f.setVisible(true);
    }

    public Maze_Runner() {
        panel.setLayout(new GridLayout(10, 10, 1, 1));
        buttons(panel);
        mainMenu();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(750, 750);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
        int x = (int) rect.getMaxX() - frame.getWidth();
        int y = 0;
        frame.setLocation(x, y);
        frame.setVisible(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Maze_Runner();
            }
        });

    }

    public int actionTerminal(String command) {
        int a = Integer.parseInt(command) - 1;
        array[a] = !array[a];

        return a;

    }

    public void keepIn(int x) {
        if (bfsDriver)
            bfs.add(x);
        else
            dfs.push(x);
    }

    public int takeOut() {
        if (bfsDriver)
            return bfs.poll();
        else
            return dfs.pop();
    }

    public boolean isEmpty() {
        if (bfsDriver)
            return bfs.isEmpty();
        else
            return dfs.isEmpty();
    }

    public void startSolving() {
        graphMaking();
    }

    public int solve() {;
        int start = startPoint;
        boolean[] visited = new boolean[100];
        int[] gparents = new int[100];
        Arrays.fill(gparents, Integer.MIN_VALUE);
        distance = new int[100];

        Arrays.fill(distance, Integer.MAX_VALUE);

        int v = -1;

        keepIn(start);
        distance[start] = 0;
        array[endPoint] = false;

        while (!isEmpty()) {
            int u = v;
            v = takeOut();

            if (!(u == -1)) {
                gparents[v] = u;
            }

            if (!visited[v]) {

                visited[v] = true;
                int elem;
                if (left(v)) {
                    elem = v - 1;
                    if (elem != gparents[v]) {
                        if (distance[elem] > (distance[v] + 1)) {
                            distance[elem] = (distance[v] + 1);
                            parent[elem] = v;
                        }

                        keepIn(elem);
                    }

                }
                if (right(v)) {
                    elem = v + 1;
                    if (elem != gparents[v]) {
                        if (distance[elem] > (distance[v] + 1)) {
                            distance[elem] = (distance[v] + 1);
                            parent[elem] = v;
                        }
                        keepIn(elem);
                    }
                }
                if (up(v)) {
                    elem = v - 10;
                    if (elem != gparents[v]) {
                        if (distance[elem] > (distance[v] + 1)) {
                            distance[elem] = (distance[v] + 1);
                            parent[elem] = v;
                        }

                        keepIn(elem);
                    }
                }
                if (down(v)) {
                    elem = v + 10;
                    if (elem != gparents[v]) {
                        if (distance[elem] > (distance[v] + 1)) {
                            distance[elem] = (distance[v] + 1);
                            parent[elem] = v;
                        }

                        keepIn(elem);
                    }
                }
            }
        }
        int mini = distance[0];
        for (int i = 1; i < distance.length; i++) {
            if ((mini > distance[i])) {
                mini = distance[i];
            }
        }
        return distance[endPoint];
    }


    public void graphMaking() {
        int path;
        if (bfsDriver) {
            path = solve();

            if (path == Integer.MAX_VALUE)
            {
                result = -1;
                mainMenu();
                result = 0;
            }
            else
            {
                result = 1;
                mainMenu();
                highLight("bfs");
                result = 0;
            }

        }


        if (dfsDriver) {
            if(bfsDriver) {
                bfsDriver = false;
                path = solve();
                bfsDriver = true;
            }
            else
            {
                path = solve();
            }

            if (path == Integer.MAX_VALUE)
            {
                result = -1;
                mainMenu();
                result = 0;
            }
            else
            {
                result = 1;
                mainMenu();
                highLight("dfs");
                result = 0;
            }

        }


    }

    public void highLight(String a) {
        int x = parent[endPoint];

        if (a.equalsIgnoreCase("bfs")) {
            for (; x != startPoint; x = parent[x]) {
                JButton jj = mapmap.get(String.valueOf(x + 1));
                String ss = jj.getBackground().toString();
                if(ss.equals(orange) || ss.equals(gray))
                {
                    jj.setBackground(Color.GRAY);
                }
                else
                    jj.setBackground(Color.BLUE);
            }
        } else {
            for (; x != startPoint; x = parent[x]) {
                JButton jj = mapmap.get(String.valueOf(x + 1));

                String ss = jj.getBackground().toString();
                if(ss.equals(blue)|| ss.equals(gray))
                    jj.setBackground(Color.GRAY);
                else
                    jj.setBackground(Color.ORANGE);


            }
        }
    }

    public boolean up(int x) {
        int a = x - 10;
        if ((a < 0))
            return false;
        else
            return !array[a];

    }

    public boolean down(int x) {
        int a = x + 10;
        if ((a < 0) || (a >= 100))
            return false;
        else
            return !array[a];

    }

    public boolean left(int x) {
        if (x % 10 == 0)
            return false;
        else {

            int a = x - 1;
            if ((a < 0))
                return false;
            else
                return !array[a];

        }
    }

    public boolean right(int x) {
        String ss = String.valueOf(x);
        if ((x != 0) && (ss.charAt(ss.length() - 1) == '9')) {
            return false;
        } else {
            int a = x + 1;
            if ((a < 0) || (a >= 100))
                return false;
            else
                return !array[a];

        }

    }

    public void redoColor()
    {
        for(int i = 0; i < mapmap.size();i++)
        {
            JButton jj =  mapmap.get((i+1)+"");
            String ss = jj.getBackground().toString();
            if(ss.equals(blue)||ss.equals(gray)||ss.equals(orange))
                jj.setBackground(Color.getColor(dfltColor));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();
        String command = button.getName();


        if (command.equals("start")) {
            if (!bfsDriver && !dfsDriver) {
                driverMsgCheck = true;
                mainMenu();
            } else {
                redoColor();
                startSolving();
            }
        } else if (command.equals("restart")) {
            frame.dispose();
            frame2.dispose();
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Maze_Runner();
                }
            });
        } else if (command.equals("exit")) {
            exit(0);
        }
        else if(command.endsWith("how to play")){
            how2play();
        }else {

            if ((!startpointCheck) && (!((Integer.parseInt(command)) == endPoint)) && (!array[Integer.parseInt(command) - 1])) {

                int pos = actionTerminal(command);
                startPoint = pos;
                startpointCheck = true;
                button.setBackground(Color.YELLOW);

            } else if ((!endpointCheck) && (!((Integer.parseInt(command) == startPoint))) && (!array[Integer.parseInt(command) - 1])) {

                int pos = actionTerminal(command);
                endPoint = pos;
                endpointCheck = true;
                button.setBackground(Color.RED);
            } else {

                int pos = actionTerminal(command);
                if (array[pos]) {
                    button.setBackground(Color.BLACK);
                    count++;
                } else if (!array[pos]) {
                    if (pos == startPoint) {

                        startPoint = -1;
                        startpointCheck = !startpointCheck;
                    } else if (pos == endPoint) {
                        endPoint = -1;
                        endpointCheck = !endpointCheck;

                    } else {
                        count--;
                    }
                    button.setBackground(Color.getColor("rmask=ff0000 gmask=ff00 bmask=ff amask=0"));

                } else
                    button.setBackground(Color.blue);

            }
            mainMenu();
        }
    }
}

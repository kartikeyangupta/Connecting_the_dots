package com.example.mr_robot.map_assignment;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int chance=0;
    private static int player1=0;
    private static int count=0;
    private static int player2=0;
    static int [][] bvFlag = new int [6][5] ;
    static int [][] bhFlag = new int [7][4] ;
    final ImageButton[][] bh = new ImageButton[7][4];
    final ImageButton[][] bv = new ImageButton[6][5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button finalbtn = findViewById(R.id.finalbtn);
        final TextView tv = findViewById(R.id.tv);
        final ImageView[] [] box = new ImageView[6][4];
        final MainActivity m = new MainActivity();
        for(int i=0;i<7;i++) {
            for(int j=0;j<4;j++) {
                bhFlag[i][j]=0;
            }
        }
        for(int i=0;i<6;i++) {
            for(int j=0;j<5;j++) {
                bvFlag[i][j]=0;
            }
        }
        //BH INITIALIZE
        bh[0][0] = findViewById(R.id.bh00);bh[0][1] = findViewById(R.id.bh01);bh[0][2] = findViewById(R.id.bh02);bh[0][3] = findViewById(R.id.bh03);
        bh[1][0] = findViewById(R.id.bh10);bh[1][1] = findViewById(R.id.bh11);bh[1][2] = findViewById(R.id.bh12);bh[1][3] = findViewById(R.id.bh13);
        bh[2][0] = findViewById(R.id.bh20);bh[2][1] = findViewById(R.id.bh21);bh[2][2] = findViewById(R.id.bh22);bh[2][3] = findViewById(R.id.bh23);
        bh[3][0] = findViewById(R.id.bh30);bh[3][1] = findViewById(R.id.bh31);bh[3][2] = findViewById(R.id.bh32);bh[3][3] = findViewById(R.id.bh33);
        bh[4][0] = findViewById(R.id.bh40);bh[4][1] = findViewById(R.id.bh41);bh[4][2] = findViewById(R.id.bh42);bh[4][3] = findViewById(R.id.bh43);
        bh[5][0] = findViewById(R.id.bh50);bh[5][1] = findViewById(R.id.bh51);bh[5][2] = findViewById(R.id.bh52);bh[5][3] = findViewById(R.id.bh53);
        bh[6][0] = findViewById(R.id.bh60);bh[6][1] = findViewById(R.id.bh61);bh[6][2] = findViewById(R.id.bh62);bh[6][3] = findViewById(R.id.bh63);
        //BV INITIALIZE
        bv[0][0] = findViewById(R.id.bv00);bv[0][1] = findViewById(R.id.bv01);bv[0][2] = findViewById(R.id.bv02);bv[0][3] = findViewById(R.id.bv03);bv[0][4] = findViewById(R.id.bv04);
        bv[1][0] = findViewById(R.id.bv10);bv[1][1] = findViewById(R.id.bv11);bv[1][2] = findViewById(R.id.bv12);bv[1][3] = findViewById(R.id.bv13);bv[1][4] = findViewById(R.id.bv14);
        bv[2][0] = findViewById(R.id.bv20);bv[2][1] = findViewById(R.id.bv21);bv[2][2] = findViewById(R.id.bv22);bv[2][3] = findViewById(R.id.bv23);bv[2][4] = findViewById(R.id.bv24);
        bv[3][0] = findViewById(R.id.bv30);bv[3][1] = findViewById(R.id.bv31);bv[3][2] = findViewById(R.id.bv32);bv[3][3] = findViewById(R.id.bv33);bv[3][4] = findViewById(R.id.bv34);
        bv[4][0] = findViewById(R.id.bv40);bv[4][1] = findViewById(R.id.bv41);bv[4][2] = findViewById(R.id.bv42);bv[4][3] = findViewById(R.id.bv43);bv[4][4] = findViewById(R.id.bv44);
        bv[5][0] = findViewById(R.id.bv50);bv[5][1] = findViewById(R.id.bv51);bv[5][2] = findViewById(R.id.bv52);bv[5][3] = findViewById(R.id.bv53);bv[5][4] = findViewById(R.id.bv54);
        //BOX INITIALZE
        box[0][0] = findViewById(R.id.box00);box[0][1] = findViewById(R.id.box01);box[0][2] = findViewById(R.id.box02);box[0][3] = findViewById(R.id.box03);Log.d("lol","allah"+String.valueOf(box[0][0]));
        box[1][0] = findViewById(R.id.box10);box[1][1] = findViewById(R.id.box11);box[1][2] = findViewById(R.id.box12);box[1][3] = findViewById(R.id.box13);
        box[2][0] = findViewById(R.id.box20);box[2][1] = findViewById(R.id.box21);box[2][2] = findViewById(R.id.box22);box[2][3] = findViewById(R.id.box23);
        box[3][0] = findViewById(R.id.box30);box[3][1] = findViewById(R.id.box31);box[3][2] = findViewById(R.id.box32);box[3][3] = findViewById(R.id.box33);
        box[4][0] = findViewById(R.id.box40);box[4][1] = findViewById(R.id.box41);box[4][2] = findViewById(R.id.box42);box[4][3] = findViewById(R.id.box43);
        box[5][0] = findViewById(R.id.box50);box[5][1] = findViewById(R.id.box51);box[5][2] = findViewById(R.id.box52);box[5][3] = findViewById(R.id.box53);
        m.button_click(bh,bv,box,tv,m);
        finalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count==58) {
                    Log.d("lol",String.valueOf(count));
                    tv.setText(String.valueOf(player1)+" "+String.valueOf(player2));
                    Log.d("lol",String.valueOf(MainActivity.this));
                    Log.d("lol",String.valueOf(Final_Activity.class));
                    Intent zz = new Intent(MainActivity.this,Final_Activity.class);
                    zz.putExtra("scoree","Player 1 : "+String.valueOf(player1)+" Player 2 :"+String.valueOf(player2));
                    startActivity(zz);
                }
            }
        });

    }
    public boolean box_checker(int i,int j,String btCheck,ImageView[][] box,TextView tv,MainActivity m) {
        Boolean loopCheck = false;
        if(btCheck.equals("bh")) {
            if(i-1 >= 0){
                if(bhFlag[i-1][j]==1 && bvFlag[i-1][j]==1 && bvFlag[i-1][j+1]==1) {
                    if(chance%2 == 0) {
                        box[i-1][j].setBackgroundResource(R.drawable.player_1_box);
                        player1++;
                    }
                    else {
                        box[i-1][j].setBackgroundResource(R.drawable.player_2_box);
                        player2++;
                    }
                    loopCheck=true;
                }
            }
            if(i+1<=6) {
                if(bhFlag[i+1][j]==1 && bvFlag[i][j]==1 && bvFlag[i][j+1]==1) {
                    if(chance%2 == 0) {
                        box[i][j].setBackgroundResource(R.drawable.player_1_box);
                        player1++;
                    }
                    else {
                        box[i][j].setBackgroundResource(R.drawable.player_2_box);
                        player2++;
                    }
                    loopCheck=true;
                }
            }
        }
        else {
            if(j-1>=0) {
                if (bvFlag[i][j - 1] == 1 && bhFlag[i][j - 1] == 1 && bhFlag[i + 1][j - 1] == 1) {
                    if (chance % 2 == 0) {
                        box[i][j - 1].setBackgroundResource(R.drawable.player_1_box);
                        player1++;
                    } else {
                        box[i][j - 1].setBackgroundResource(R.drawable.player_2_box);
                        player2++;
                    }
                    loopCheck = true;
                }
            }
            if(j+1<=4) {
                if(bvFlag[i][j+1]==1 && bhFlag[i][j]==1 && bhFlag[i+1][j]==1) {
                    if(chance%2 == 0) {
                        box[i][j].setBackgroundResource(R.drawable.player_1_box);
                        player1++;
                    }
                    else {
                        box[i][j].setBackgroundResource(R.drawable.player_2_box);
                        player2++;
                    }
                    loopCheck=true;
                }
            }
        }
        return loopCheck;
    }

    public void button_click(final ImageButton[][] bh, final ImageButton[][] bv, final ImageView[][] box, final TextView tv, final MainActivity m) {
        for(int i=0;i<7;i++) {
            for(int j=0;j<4;j++) {
                final int finalI = i;
                final int finalJ = j;
                bh[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(bhFlag[finalI][finalJ]==0) {
                            bh[finalI][finalJ].setBackgroundResource(R.drawable.horizontal_bar_full);
                            count++;
                            bhFlag[finalI][finalJ]=1;
                            Boolean bool = m.box_checker(finalI, finalJ,"bh",box,tv,m);
                            if(!bool) {
                                chance++;
                                if(chance%2==0) {
                                    tv.setText("PLAYER 1");
                                }
                                else
                                    tv.setText("Player 2");
                            }
                        }
                    }
                });

            }
        }
        for(int i=0;i<6;i++) {
            for(int j=0;j<5;j++) {
                final int finalI = i;
                final int finalJ = j;
                bv[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(bvFlag[finalI][finalJ]==0) {
                            bv[finalI][finalJ].setBackgroundResource(R.drawable.vertical_bar_full);
                            count++;
                            bvFlag[finalI][finalJ]=1;
                            Boolean bool = m.box_checker(finalI, finalJ,"bv",box,tv,m);
                            if(!bool) {
                                chance++;
                                if(chance%2==0) {
                                    tv.setText("PLAYER 1");
                                }
                                else
                                    tv.setText("Player 2");
                            }

                        }
                    }
                });
            }
        }
    }

}
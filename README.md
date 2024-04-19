
# Rapport
Skapade en ytterligare aktivitet genom new -> Activity -> Empty Views Activity, och döpte den till ExtraActivity.

La till en knapp i den första (start-activityn, activity_main) genom xml filen för scenen. Denna används för att starta den andra aktivitieten (Extra Activity)
i ett senare skede. Jag gav även knappen ett ID, för att kunna nå den.
```
<Button
        android:layout_width="match_parent"
        android:id="@+id/ExtraActivityButton"
        ...
        />
```
För att kunna använda knappen, satte jag en onClickListener som därmed reagerar på när knappen trycks på. I listenern lägger jag till att
den ska skapa en ny intent, där intenten skapas i MainActivity, och "går till/leder till/är dirrigerad till" ExtraActivity classen. StartActivity(intent)
innebär alltså att intenten startas (och igentligen skapas, via tidigare kodrader) vid knapptrycket.
```
ExtraActivityButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ExtraActivity.class);
                ...
                ...
                startActivity(intent);
            }
        });
```

Genom intent.putExtra signaleras vilken 
```
ExtraActivityButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ExtraActivity.class);
                intent.putExtra("potatoType", "King Edward"); // Optional
                intent.putExtra("anyNumber", 7); // Optional
                startActivity(intent);
            }
        });
```



Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.

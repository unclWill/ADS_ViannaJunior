function ehPar(num) {
    return num % 2 == 0;
}

function tocarMusicaPrimeiraParte(k) {
    for (i = 1; i <= k; i++) {
        if (i == 1 && ehPar(i) == false) {
            console.log(`${i} elefante incomoda muita gente\n`);
        } else if (i > 1 && ehPar(i) == false) {
            console.log(`${i} elefantes incomodam muita gente\n`);
        }

        cont = 0;
        if (ehPar(i)) {
            console.log(`${i} elefantes`);
            while (cont < i) {
                console.log("incomodam");
                cont++;
            }
            console.log("muito mais\n");
        }
    }
    tocarMusicaSegundaParte(k);
}

function tocarMusicaSegundaParte(k) {
    for (i = k; i >= 1; i--) {
        if (i > 1 && ehPar(i)) {
            console.log(`${i} elefantes incomodam muita gente\n`);
        }

        cont = 1;
        if (ehPar(i) == false) {
            if (i == 1) {
                console.log(`${i} elefante incomoda muito menos`);
            } else {
                console.log(`${i} elefantes`);
                while (cont <= i) {
                    console.log("incomodam");
                    cont++;
                }
                console.log("muito menos\n");
            }
        }
    }
}

tocarMusicaPrimeiraParte(10);
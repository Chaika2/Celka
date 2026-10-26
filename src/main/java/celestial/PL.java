/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package celestial;

import celestial.C;
import celestial.C_class;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.Y;
import celestial.cb_3;
import celestial.cq_3;
import celestial.rgP_2;
import celestial.rmT_2;
import celestial.rrAM;
import celestial.rrLO;
import celestial.rrQJ;
import celestial.rrZr_1;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.ruS_2;
import celestial.y_1;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PL
extends Pv_1 {
    private static boolean[] id_protected;
    private static short[] id_throws;
    private static byte[] id_case;
    private static String[] id_catch;
    public static Object[] id_break;
    public Object[] id_byte;

    private boolean id_byte() {
        rgP_2 rgP_22 = ((cq_3)((Ps_1)this.id_class[PL.id_throws[36]]).id_throws().id_class[id_throws[37]]).id_implements().id_protected();
        if (rgP_22 == null) {
            return id_protected[5];
        }
        return rgP_22.id_byte().contains(id_catch[8]);
    }

    public PL(C_class c_class) {
        super(c_class);
        ArrayList arrayList;
        HashSet hashSet;
        this.id_catch();
        this.id_byte[PL.id_throws[0]] = hashSet = new HashSet();
        this.id_byte[PL.id_throws[1]] = arrayList = new ArrayList();
        Boolean bl = id_protected[0];
        this.id_byte[PL.id_throws[2]] = bl;
        Boolean bl2 = id_protected[1];
        this.id_byte[PL.id_throws[3]] = bl2;
        ((Set)this.id_byte[id_throws[4]]).add(id_catch[0]);
        ((List)this.id_byte[id_throws[5]]).add(id_catch[1]);
        this.id_class();
    }

    static {
        PL.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x518C253F9821BDD4L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA39DCB62;
    }

    @Override
    public void id_class(C c) {
        this.id_catch();
        super.id_class(c);
        String string = c.id_class();
        if (((Boolean)this.id_byte[id_throws[29]]).booleanValue() && (rrfq_3)((Object)rrfp_3.id_class[id_throws[30]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[31]]) && ((Set)this.id_byte[id_throws[32]]).contains(((rrZr_1)rrQJ.id_class[id_throws[33]]).id_break()) && !string.startsWith((String)C_class.id_instanceof().id_protected.id_class[id_throws[34]]) && !string.startsWith(id_catch[7]) && this.id_byte()) {
            c.id_break();
        }
    }

    @Override
    public void id_class(rrAM rrAM2) {
        this.id_catch();
        super.id_class(rrAM2);
        Boolean bl = id_protected[4];
        this.id_byte[PL.id_throws[35]] = bl;
    }

    @Override
    public void id_class(rrLO rrLO2) {
        this.id_catch();
        super.id_class(rrLO2);
        String string = rrLO2.id_protected().toLowerCase();
        if ((rrfq_3)((Object)rrfp_3.id_class[id_throws[19]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[20]]) && string.contains(id_catch[5]) && string.contains(id_catch[6]) && ((Boolean)this.id_byte[id_throws[21]]).booleanValue() && ((Set)this.id_byte[id_throws[22]]).contains(((rrZr_1)rrQJ.id_class[id_throws[23]]).id_break()) && this.id_byte()) {
            String string2 = (String)((List)this.id_byte[id_throws[24]]).get(ThreadLocalRandom.current().nextInt(((List)this.id_byte[id_throws[25]]).size()));
            Boolean bl = id_protected[3];
            this.id_byte[PL.id_throws[26]] = bl;
            ((cb_3)((Ps_1)this.id_class[PL.id_throws[27]]).id_throws().id_class[id_throws[28]]).id_case(string2);
        }
    }

    public void id_class() {
        this.id_catch();
        if (((Boolean)this.id_byte[id_throws[6]]).booleanValue()) {
            return;
        }
        CompletableFuture.runAsync(() -> {
            this.id_catch();
            try {
                String string = this.id_protected();
                if (string != null && !string.isEmpty()) {
                    ((Set)this.id_byte[id_throws[38]]).clear();
                    ((List)this.id_byte[id_throws[39]]).clear();
                    JsonObject jsonObject = new JsonParser().parse(string).getAsJsonObject();
                    JsonArray jsonArray = jsonObject.getAsJsonArray(id_catch[9]);
                    JsonArray jsonArray2 = jsonObject.getAsJsonArray(id_catch[10]);
                    Boolean bl = jsonObject.get(id_catch[11]).getAsBoolean();
                    this.id_byte[PL.id_throws[40]] = bl;
                    Boolean bl2 = jsonObject.get(id_catch[12]).getAsBoolean();
                    this.id_byte[PL.id_throws[41]] = bl2;
                    for (JsonElement jsonElement : jsonArray) {
                        ((Set)this.id_byte[id_throws[42]]).add(jsonElement.getAsString());
                    }
                    for (JsonElement jsonElement : jsonArray2) {
                        ((List)this.id_byte[id_throws[43]]).add(jsonElement.getAsString());
                    }
                }
                Boolean bl = id_protected[6];
                this.id_byte[PL.id_throws[44]] = bl;
            }
            catch (Exception exception) {
                System.err.println("Failed to load servers: " + exception.getMessage());
                exception.printStackTrace();
            }
        });
    }

    private static void id_break() {
        short[] sArray = new short[45];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[5] = 1;
        sArray[6] = 5;
        sArray[7] = 5000;
        sArray[8] = 5000;
        sArray[10] = 4;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[14] = 5;
        sArray[15] = 4;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[21] = 2;
        sArray[23] = 5;
        sArray[24] = 1;
        sArray[25] = 1;
        sArray[26] = 4;
        sArray[27] = 1;
        sArray[28] = 57;
        sArray[29] = 3;
        sArray[30] = 1;
        sArray[31] = 2;
        sArray[33] = 5;
        sArray[35] = 4;
        sArray[36] = 1;
        sArray[37] = 19;
        sArray[39] = 1;
        sArray[40] = 3;
        sArray[41] = 2;
        sArray[43] = 1;
        sArray[44] = 5;
        id_throws = sArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-11, 117, -34, -29, 51, 114, -28, 67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(y_1 y_12) {
        ruS_2<?> ruS_22;
        this.id_catch();
        super.id_break(y_12);
        if (y_12.id_byte() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[9]]) && (ruS_22 = y_12.id_protected()) instanceof rmT_2) {
            rmT_2 rmT_22 = (rmT_2)ruS_22;
            String string = rmT_22.id_break();
            if (((Boolean)this.id_byte[id_throws[10]]).booleanValue() || (rrfq_3)((Object)rrfp_3.id_class[id_throws[11]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[12]]) || !((Set)this.id_byte[id_throws[13]]).contains(((rrZr_1)rrQJ.id_class[id_throws[14]]).id_break()) || !this.id_byte()) {
                Boolean bl = id_protected[2];
                this.id_byte[PL.id_throws[15]] = bl;
                return;
            }
            if (!string.startsWith((String)C_class.id_instanceof().id_protected.id_class[id_throws[16]]) && !string.startsWith(id_catch[4])) {
                String string2 = (String)((List)this.id_byte[id_throws[17]]).get(ThreadLocalRandom.current().nextInt(((List)this.id_byte[id_throws[18]]).size()));
                rmT_22.id_class(string + " " + string2);
            }
        }
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[13];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[11] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        PL.id_throws();
        PL.id_case();
        PL.id_break();
        PL.id_implements();
        PL.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{id_catch[13]};
        id_break = objectArray;
    }

    private void id_catch() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_case[0]];
            objectArray[PL.id_case[1]] = id_protected[7];
            objectArray[PL.id_case[2]] = id_protected[8];
            objectArray[PL.id_case[3]] = id_protected[9];
            objectArray[PL.id_case[4]] = id_protected[10];
        }
    }

    private static void id_case() {
        id_catch = new String[]{new String("makavtoJJ"), new String("\u044f \u0435\u0431\u0430\u043d\u044b\u0439 \u043b\u043e\u0445 \u0441 \u0433\u043e\u0432\u043d\u043e \u0447\u0438\u0442\u043e\u043c, \u043b\u0443\u0447\u0448\u0435 \u043a\u0443\u043f\u0438\u0442\u0435 \u0446\u0435\u043b\u0435\u0441\u0442\u0438\u0430\u043b"), new String("https://pastebin.com/raw/YB4sGv7n"), new String("GET"), new String("/"), new String("[\u2694]"), new String("\u043f\u043e\u0431\u0435\u0434\u0443"), new String("/"), new String("\u0420\u0435\u0436\u0438\u043c: \u0414\u0443\u044d\u043b\u0438"), new String("names"), new String("messages"), new String("cancelOwnMessages"), new String("sendAfterWin"), new String("https://pastebin.com/raw/YB4sGv7n")};
    }

    private static void id_implements() {
        id_case = new byte[]{6, 2, 3, 4, 5};
    }

    private String id_protected() {
        String string;
        URL uRL = new URL(id_catch[2]);
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.setRequestMethod(id_catch[3]);
        httpURLConnection.setConnectTimeout(id_throws[7]);
        httpURLConnection.setReadTimeout(id_throws[8]);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        try {
            String string2;
            StringBuilder stringBuilder = new StringBuilder();
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuilder.append(string2);
            }
            string = stringBuilder.toString();
        }
        catch (Throwable throwable) {
            try {
                try {
                    bufferedReader.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (Exception exception) {
                System.err.println("Error fetching data: " + exception.getMessage());
                return null;
            }
        }
        bufferedReader.close();
        return string;
    }
}


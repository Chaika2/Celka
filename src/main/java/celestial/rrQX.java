/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.OA;
import celestial.OC;
import celestial.Qw_1;
import celestial.manager.ConfigManager;
import celestial.manager.FontManager;
import celestial.rrCS;
import celestial.rrFU;
import celestial.rrIJ;
import celestial.rrLM;
import celestial.rrZP;
import celestial.rrjC_2;
import celestial.rruc_1;
import celestial.rrvT;
import celestial.rrvV;
import celestial.rrwN_2;
import celestial.rrwY_2;
import celestial.rrwe_3;
import celestial.rrwq_3;
import celestial.ui.clickgui.ClickGuiScreen;
import celestial.util.MinecraftAccessor;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQX
extends Enum<rrQX>
implements MinecraftAccessor {
    public Object[] fields09f1f28026cd378cb9df490a64ac8f2a;
    private static byte[] bytes09f1f28026cd378cb9df490a64ac8f2a;
    private static short[] shorts09f1f28026cd378cb9df490a64ac8f2a;
    private static String[] strings09f1f28026cd378cb9df490a64ac8f2a;
    private static boolean[] booleans09f1f28026cd378cb9df490a64ac8f2a;
    public static Object[] staticFields09f1f28026cd378cb9df490a64ac8f2a;

    public ClickGuiScreen id_byte() {
        return (ClickGuiScreen)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[38]];
    }

    private static void id_int() {
        bytes09f1f28026cd378cb9df490a64ac8f2a = new byte[]{2, 3, 24, 9, 4, 2};
    }

    private rrQX() {
        this.id_native();
    }

    static {
        rrQX.ntfClinit();
    }

    public static rrQX[] values() {
        return (rrQX[])((rrQX[])staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[0]]).clone();
    }

    public static rrQX valueOf(String string) {
        return Enum.valueOf(rrQX.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9BE391924B4371BDL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4E34FA89;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{126, -48, 11, -46, -56, 110, -82, -38}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrvV id_class() {
        return (rrvV)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[33]];
    }

    public ConfigManager id_break() {
        return (ConfigManager)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[31]];
    }

    public rrwe_3 id_throws() {
        return (rrwe_3)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[36]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrQX.id_final();
        rrQX.id_new();
        rrQX.id_continue();
        rrQX.id_int();
        rrQX.id_volatile();
    }

    public OA id_finally() {
        return (OA)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[39]];
    }

    public rrIJ id_catch() {
        return (rrIJ)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[34]];
    }

    public void id_extends() {
        ((OA)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[24]]).id_class(rrLM.id_class());
        ((rrwe_3)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[25]]).id_catch();
        ((rrIJ)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[26]]).id_byte(strings09f1f28026cd378cb9df490a64ac8f2a[2], booleans09f1f28026cd378cb9df490a64ac8f2a[6]);
        ((rrwY_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[27]]).id_byte(strings09f1f28026cd378cb9df490a64ac8f2a[3], booleans09f1f28026cd378cb9df490a64ac8f2a[7]);
        ((rrwN_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[28]]).id_class();
        ((Qw_1)rrQX.id_import.id_class[shorts09f1f28026cd378cb9df490a64ac8f2a[29]]).id_break();
        ((rrZP)rrZP.staticFieldsfda1a12b8e6d3a64af93b1c14ed22523[shorts09f1f28026cd378cb9df490a64ac8f2a[30]]).id_class();
    }

    public boolean id_case() {
        ((rruc_1)((Object)rruc_1.staticFields8976bba2dba834c8b8aad687eeef9d7a[shorts09f1f28026cd378cb9df490a64ac8f2a[1]])).id_break();
        ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[shorts09f1f28026cd378cb9df490a64ac8f2a[2]]).id_volatile();
        OC oC = new OC();
        this.fields09f1f28026cd378cb9df490a64ac8f2a[rrQX.shorts09f1f28026cd378cb9df490a64ac8f2a[3]] = oC;
        ((OA)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[4]]).id_class(this.getClass().getPackageName(), (method, clazz) -> {
            Object[] objectArray = new Object[bytes09f1f28026cd378cb9df490a64ac8f2a[0]];
            objectArray[rrQX.booleans09f1f28026cd378cb9df490a64ac8f2a[8]] = clazz;
            objectArray[rrQX.booleans09f1f28026cd378cb9df490a64ac8f2a[9]] = MethodHandles.lookup();
            return (MethodHandles.Lookup)method.invoke(null, objectArray);
        });
        ((rrZP)rrZP.staticFieldsfda1a12b8e6d3a64af93b1c14ed22523[shorts09f1f28026cd378cb9df490a64ac8f2a[5]]).id_break();
        rrjC_2.id_break();
        C_throws.id_class().id_break();
        ConfigManager configManager = new ConfigManager();
        this.fields09f1f28026cd378cb9df490a64ac8f2a[rrQX.shorts09f1f28026cd378cb9df490a64ac8f2a[6]] = configManager;
        rrvT rrvT2 = new rrvT();
        this.fields09f1f28026cd378cb9df490a64ac8f2a[rrQX.shorts09f1f28026cd378cb9df490a64ac8f2a[7]] = rrvT2;
        rrwe_3 rrwe_32 = new rrwe_3();
        this.fields09f1f28026cd378cb9df490a64ac8f2a[rrQX.shorts09f1f28026cd378cb9df490a64ac8f2a[8]] = rrwe_32;
        rrIJ rrIJ2 = new rrIJ();
        this.fields09f1f28026cd378cb9df490a64ac8f2a[rrQX.shorts09f1f28026cd378cb9df490a64ac8f2a[9]] = rrIJ2;
        rrwY_2 rrwY_22 = new rrwY_2();
        this.fields09f1f28026cd378cb9df490a64ac8f2a[rrQX.shorts09f1f28026cd378cb9df490a64ac8f2a[10]] = rrwY_22;
        rrvV rrvV2 = new rrvV();
        this.fields09f1f28026cd378cb9df490a64ac8f2a[rrQX.shorts09f1f28026cd378cb9df490a64ac8f2a[11]] = rrvV2;
        rrwN_2 rrwN_22 = new rrwN_2();
        this.fields09f1f28026cd378cb9df490a64ac8f2a[rrQX.shorts09f1f28026cd378cb9df490a64ac8f2a[12]] = rrwN_22;
        ((rrwN_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[13]]).id_break();
        ((rrIJ)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[14]]).id_class(strings09f1f28026cd378cb9df490a64ac8f2a[0], booleans09f1f28026cd378cb9df490a64ac8f2a[0]);
        ((rrwY_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[15]]).id_break(booleans09f1f28026cd378cb9df490a64ac8f2a[1]);
        ((rrwe_3)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[16]]).id_byte();
        ClickGuiScreen clickGuiScreen = new ClickGuiScreen();
        this.fields09f1f28026cd378cb9df490a64ac8f2a[rrQX.shorts09f1f28026cd378cb9df490a64ac8f2a[17]] = clickGuiScreen;
        ((rrIJ)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[18]]).id_class(strings09f1f28026cd378cb9df490a64ac8f2a[1], booleans09f1f28026cd378cb9df490a64ac8f2a[2]);
        rrjC_2.id_protected().id_class(rrjC_2.id_protected().id_class());
        ((rrwq_3)((Object)rrwq_3.staticFieldsd739829cf0613d349fc0bda49435f7f4[shorts09f1f28026cd378cb9df490a64ac8f2a[19]])).id_byte();
        new rrCS();
        Runtime.getRuntime().addShutdownHook(new Thread(((rrQX)staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[20]])::id_extends));
        if (!((File)staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[21]]).exists()) {
            try {
                ((File)staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[22]]).createNewFile();
                Files.write(((File)staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[23]]).toPath(), new byte[booleans09f1f28026cd378cb9df490a64ac8f2a[3]], new OpenOption[booleans09f1f28026cd378cb9df490a64ac8f2a[4]]);
                rrFU.id_class();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return booleans09f1f28026cd378cb9df490a64ac8f2a[5];
    }

    private static void id_continue() {
        short[] sArray = new short[41];
        sArray[0] = 3;
        sArray[3] = 8;
        sArray[4] = 8;
        sArray[7] = 1;
        sArray[8] = 5;
        sArray[9] = 3;
        sArray[10] = 4;
        sArray[11] = 2;
        sArray[12] = 6;
        sArray[13] = 6;
        sArray[14] = 3;
        sArray[15] = 4;
        sArray[16] = 5;
        sArray[17] = 7;
        sArray[18] = 3;
        sArray[21] = 1;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[24] = 8;
        sArray[25] = 5;
        sArray[26] = 3;
        sArray[27] = 4;
        sArray[28] = 6;
        sArray[29] = 20;
        sArray[32] = 1;
        sArray[33] = 2;
        sArray[34] = 3;
        sArray[35] = 4;
        sArray[36] = 5;
        sArray[37] = 6;
        sArray[38] = 7;
        sArray[39] = 8;
        shorts09f1f28026cd378cb9df490a64ac8f2a = sArray;
    }

    public rrwY_2 id_implements() {
        return (rrwY_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[35]];
    }

    private static void id_new() {
        strings09f1f28026cd378cb9df490a64ac8f2a = new String[]{new String("autocfg"), new String("autocfg"), new String("autocfg"), new String("autocfg"), new String("INSTANCE"), new String("start.celka")};
    }

    private static /* synthetic */ rrQX[] id_package() {
        rrQX[] rrQXArray = new rrQX[booleans09f1f28026cd378cb9df490a64ac8f2a[10]];
        rrQXArray[rrQX.booleans09f1f28026cd378cb9df490a64ac8f2a[11]] = (rrQX)staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[40]];
        return rrQXArray;
    }

    public rrwN_2 id_protected() {
        return (rrwN_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[37]];
    }

    public rrvT id_private() {
        return (rrvT)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[32]];
    }

    private static void id_final() {
        boolean[] blArray = new boolean[16];
        blArray[5] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[14] = true;
        booleans09f1f28026cd378cb9df490a64ac8f2a = blArray;
    }

    private static void id_volatile() {
        Object[] objectArray;
        objectArray = new Object[]{new rrQX(), new File("C:\\Celestial\\Beta 1.16.5\\start.celka"), false, new rrQX[]{(rrQX)objectArray[0]}};
        staticFields09f1f28026cd378cb9df490a64ac8f2a = objectArray;
    }

    private void id_native() {
        if (this.fields09f1f28026cd378cb9df490a64ac8f2a == null) {
            this.fields09f1f28026cd378cb9df490a64ac8f2a = new Object[9];
        }
    }
}


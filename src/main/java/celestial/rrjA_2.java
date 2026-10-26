/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.ViaManagerImpl
 *  com.viaversion.viaversion.ViaManagerImpl$ViaManagerBuilder
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.ViaManager
 *  com.viaversion.viaversion.api.platform.ViaInjector
 *  com.viaversion.viaversion.api.platform.ViaPlatform
 *  com.viaversion.viaversion.api.platform.ViaPlatformLoader
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.protocol.ProtocolManagerImpl
 *  org.apache.logging.log4j.LogManager
 */
package celestial;

import celestial.rrjI_2;
import celestial.rrjR_2;
import celestial.rrjg_3;
import celestial.rrjo_3;
import celestial.rrjp_3;
import celestial.rrjw_3;
import celestial.rrjy_3;
import com.viaversion.viaversion.ViaManagerImpl;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.ViaManager;
import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.api.platform.ViaPlatform;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocol.ProtocolManagerImpl;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;

public class rrjA_2 {
    private static int[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    private static short[] id_throws;
    private static String[] id_case;
    public static Object[] id_break;
    private static byte[] id_catch;

    public static List<ProtocolVersion> id_byte() {
        return new LinkedList<ProtocolVersion>(((Map)id_break[id_throws[35]]).keySet());
    }

    private static void id_int() {
        id_case = new String[]{new String("viaversion"), new String("com.viaversion.viabackwards.api.ViaBackwardsPlatform"), new String("ViaVersion"), new String("ViaVersion"), new String("ViaBackwards"), new String("${vialoadingbase_version}")};
    }

    public rrjA_2(LinkedList<rrjp_3> linkedList, File file, int n, BooleanSupplier booleanSupplier, Supplier<JsonObject> supplier, Consumer<ViaProviders> consumer, Consumer<ViaManagerImpl.ViaManagerBuilder> consumer2, Consumer<rrjy_3> consumer3) {
        Consumer<rrjy_3> consumer4;
        Consumer<ViaManagerImpl.ViaManagerBuilder> consumer5;
        Consumer<ViaProviders> consumer6;
        Supplier<JsonObject> supplier2;
        LinkedList<rrjp_3> linkedList2;
        this.id_else();
        this.id_class[rrjA_2.id_throws[0]] = linkedList2 = linkedList;
        File file2 = new File(file, id_case[0]);
        this.id_class[rrjA_2.id_throws[1]] = file2;
        Integer n2 = n;
        this.id_class[rrjA_2.id_throws[2]] = n2;
        BooleanSupplier booleanSupplier2 = booleanSupplier;
        this.id_class[rrjA_2.id_throws[3]] = booleanSupplier2;
        this.id_class[rrjA_2.id_throws[4]] = supplier2 = supplier;
        this.id_class[rrjA_2.id_throws[5]] = consumer6 = consumer;
        this.id_class[rrjA_2.id_throws[6]] = consumer5 = consumer2;
        this.id_class[rrjA_2.id_throws[7]] = consumer4 = consumer3;
        rrjA_2 rrjA_22 = this;
        rrjA_2.id_break[rrjA_2.id_throws[8]] = rrjA_22;
        this.id_case();
    }

    static {
        rrjA_2.ntfClinit();
    }

    private static void id_this() {
        Object[] objectArray = new Object[6];
        objectArray[0] = id_case[5];
        objectArray[1] = new rrjo_3(LogManager.getLogger((String)"ViaVersion"));
        objectArray[2] = new rrjp_3(id_case[3], () -> id_protected[4], () -> {}, list -> list.addAll(rrjI_2.id_break()));
        objectArray[3] = new rrjp_3(id_case[4], () -> rrjA_2.id_class(id_case[1]), () -> new rrjw_3(Via.getManager().getPlatform().getDataFolder()));
        objectArray[4] = new LinkedHashMap();
        id_break = objectArray;
    }

    public static boolean id_class(String string) {
        try {
            Class.forName(string);
            return id_protected[0];
        }
        catch (Exception exception) {
            return id_protected[1];
        }
    }

    public void id_class(ProtocolVersion protocolVersion) {
        this.id_class(rrjA_2.id_break(protocolVersion));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA5C6076AC7FF5BC3L;
    }

    public static rrjy_3 id_class(int n) {
        return ((Map)id_break[id_throws[34]]).values().stream().filter(rrjy_32 -> rrjy_32.getVersion() == n ? id_protected[2] : id_protected[3]).findFirst().orElse(null);
    }

    public void id_class(rrjy_3 rrjy_32) {
        rrjy_3 rrjy_33 = rrjy_32;
        this.id_class[rrjA_2.id_throws[13]] = rrjy_33;
        if ((Consumer)this.id_class[id_throws[14]] != null) {
            ((Consumer)this.id_class[id_throws[15]]).accept((rrjy_3)((Object)this.id_class[id_throws[16]]));
        }
    }

    public Supplier<JsonObject> id_class() {
        return (Supplier)this.id_class[id_throws[31]];
    }

    public File id_break() {
        return (File)this.id_class[id_throws[29]];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x55CA2FF9;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{53, -121, -55, -9, -38, 95, -95, 125}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrjy_3 id_break(ProtocolVersion protocolVersion) {
        return rrjA_2.id_class(protocolVersion.getVersion());
    }

    public rrjy_3 id_throws() {
        if ((BooleanSupplier)this.id_class[id_throws[9]] != null && ((BooleanSupplier)this.id_class[id_throws[10]]).getAsBoolean()) {
            return (rrjy_3)((Object)this.id_class[id_throws[11]]);
        }
        return (rrjy_3)((Object)this.id_class[id_throws[12]]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrjA_2.id_finally();
        rrjA_2.id_int();
        rrjA_2.id_package();
        rrjA_2.id_native();
        rrjA_2.id_final();
        rrjA_2.id_this();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_protected = blArray;
    }

    public List<rrjp_3> id_catch() {
        return (LinkedList)this.id_class[id_throws[28]];
    }

    public void id_case() {
        rrjp_3 rrjp_322;
        for (rrjp_3 rrjp_322 : (LinkedList)this.id_class[id_throws[17]]) {
            rrjp_322.id_class();
        }
        for (rrjp_3 rrjp_322 : (List)rrjp_3.id_break[id_throws[18]]) {
            ((Map)id_break[id_throws[19]]).put(rrjp_322, new rrjy_3(rrjp_322.getVersion(), rrjp_322.getName(), ((List)rrjp_3.id_break[id_throws[20]]).indexOf(rrjp_322)));
        }
        rrjy_3 rrjy_32 = rrjA_2.id_break(ProtocolVersion.getProtocol((int)((Integer)this.id_class[id_throws[21]])));
        this.id_class[rrjA_2.id_throws[22]] = rrjy_32;
        rrjy_3 rrjy_33 = rrjy_32;
        this.id_class[rrjA_2.id_throws[23]] = rrjy_33;
        rrjI_2 rrjI_22 = new rrjI_2((Logger)id_break[id_throws[24]]);
        rrjp_322 = ViaManagerImpl.builder().platform((ViaPlatform)rrjI_22).loader((ViaPlatformLoader)new rrjR_2()).injector((ViaInjector)new rrjg_3());
        if ((Consumer)this.id_class[id_throws[25]] != null) {
            ((Consumer)this.id_class[id_throws[26]]).accept(rrjp_322);
        }
        Via.init((ViaManager)rrjp_322.build());
        ViaManagerImpl viaManagerImpl = (ViaManagerImpl)Via.getManager();
        viaManagerImpl.addEnableListener(() -> {
            for (rrjp_3 rrjp_32 : (LinkedList)this.id_class[id_throws[36]]) {
                rrjp_32.id_class((Logger)id_break[id_throws[37]]);
            }
        });
        viaManagerImpl.init();
        viaManagerImpl.onServerLoaded();
        viaManagerImpl.getProtocolManager().setMaxProtocolPathSize(id_byte[0]);
        viaManagerImpl.getProtocolManager().setMaxPathDeltaIncrease((int)id_catch[0]);
        ((ProtocolManagerImpl)viaManagerImpl.getProtocolManager()).refreshVersions();
    }

    private void id_else() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_catch[4]];
            objectArray[rrjA_2.id_catch[5]] = id_protected[6];
        }
    }

    public int id_implements() {
        return (Integer)this.id_class[id_throws[30]];
    }

    private static void id_package() {
        short[] sArray = new short[38];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 4;
        sArray[5] = 5;
        sArray[6] = 6;
        sArray[7] = 7;
        sArray[8] = 5;
        sArray[9] = 3;
        sArray[10] = 3;
        sArray[11] = 8;
        sArray[12] = 9;
        sArray[13] = 9;
        sArray[14] = 7;
        sArray[15] = 7;
        sArray[16] = 9;
        sArray[18] = 1;
        sArray[19] = 4;
        sArray[20] = 1;
        sArray[21] = 2;
        sArray[22] = 8;
        sArray[23] = 9;
        sArray[24] = 1;
        sArray[25] = 6;
        sArray[26] = 6;
        sArray[27] = 5;
        sArray[29] = 1;
        sArray[30] = 2;
        sArray[31] = 4;
        sArray[32] = 5;
        sArray[33] = 4;
        sArray[34] = 4;
        sArray[35] = 4;
        sArray[37] = 1;
        id_throws = sArray;
    }

    public static rrjA_2 id_protected() {
        return (rrjA_2)id_break[id_throws[27]];
    }

    public Consumer<ViaProviders> id_private() {
        return (Consumer)this.id_class[id_throws[32]];
    }

    private static void id_final() {
        id_byte = new int[]{Integer.MAX_VALUE};
    }

    private static void id_native() {
        id_catch = new byte[]{-1, 2, 3, 4, 10, 2, 6};
    }
}


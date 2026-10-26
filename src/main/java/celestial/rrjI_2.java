/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.ViaAPI
 *  com.viaversion.viaversion.api.command.ViaCommandSender
 *  com.viaversion.viaversion.api.configuration.ConfigurationProvider
 *  com.viaversion.viaversion.api.configuration.ViaVersionConfig
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.PlatformTask
 *  com.viaversion.viaversion.api.platform.UnsupportedSoftware
 *  com.viaversion.viaversion.api.platform.ViaPlatform
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.libs.gson.JsonObject
 */
package celestial;

import celestial.rrjA_2;
import celestial.rrjK_2;
import celestial.rrjV_2;
import celestial.rrjj_3;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.ViaAPI;
import com.viaversion.viaversion.api.command.ViaCommandSender;
import com.viaversion.viaversion.api.configuration.ConfigurationProvider;
import com.viaversion.viaversion.api.configuration.ViaVersionConfig;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.PlatformTask;
import com.viaversion.viaversion.api.platform.UnsupportedSoftware;
import com.viaversion.viaversion.api.platform.ViaPlatform;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjI_2
implements ViaPlatform<UUID> {
    private static boolean[] id_break;
    public Object[] id_class;
    private static long[] id_byte;
    private static byte[] id_protected;
    private static String[] id_throws;
    private static short[] id_case;

    private static void id_byte() {
        id_throws = new String[]{new String("viaversion.yml"), new String("4.7.0"), new String("ViaVersion"), new String("${vialoadingbase_version}")};
    }

    public rrjK_2 id_byte(Runnable runnable, long l) {
        return new rrjK_2(Via.getManager().getScheduler().schedule(runnable, l * id_byte[2], TimeUnit.MILLISECONDS));
    }

    public rrjI_2(Logger logger) {
        this.id_throws();
        rrjj_3 rrjj_32 = new rrjj_3();
        this.id_class[rrjI_2.id_case[0]] = rrjj_32;
        File file = rrjA_2.id_protected().id_break();
        Logger logger2 = logger;
        this.id_class[rrjI_2.id_case[1]] = logger2;
        rrjV_2 rrjV_22 = new rrjV_2(new File(file, id_throws[0]));
        this.id_class[rrjI_2.id_case[2]] = rrjV_22;
    }

    static {
        rrjI_2.ntfClinit();
    }

    public rrjK_2 id_class(Runnable runnable) {
        return new rrjK_2(Via.getManager().getScheduler().execute(runnable));
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{60, 6, -37, 30, -77, 23, 31, 114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrjV_2 id_class() {
        return (rrjV_2)((Object)this.id_class[id_case[7]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA0414E422FF35749L;
    }

    public rrjK_2 id_class(Runnable runnable, long l) {
        return this.id_break(runnable, l);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x428B1DEB;
    }

    public Logger getLogger() {
        return (Logger)this.id_class[id_case[3]];
    }

    public rrjK_2 id_break(Runnable runnable, long l) {
        return new rrjK_2(Via.getManager().getScheduler().scheduleRepeating(runnable, id_byte[0], l * id_byte[1], TimeUnit.MILLISECONDS));
    }

    public rrjK_2 id_break(Runnable runnable) {
        return this.id_class(runnable);
    }

    public static List<ProtocolVersion> id_break() {
        List<ProtocolVersion> list = new ArrayList(ProtocolVersion.getProtocols()).stream().filter(protocolVersion -> protocolVersion != ProtocolVersion.unknown && ProtocolVersion.getProtocols().indexOf(protocolVersion) >= id_protected[0] ? id_break[6] : id_break[7]).collect(Collectors.toList());
        Collections.reverse(list);
        return list;
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[1]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrjI_2.id_case();
        rrjI_2.id_byte();
        rrjI_2.id_catch();
        rrjI_2.id_private();
        rrjI_2.id_protected();
    }

    private static void id_catch() {
        long[] lArray = new long[3];
        lArray[1] = 50L;
        lArray[2] = 50L;
        id_byte = lArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        id_break = blArray;
    }

    private static void id_protected() {
        id_protected = new byte[]{7, 3};
    }

    private static void id_private() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 2;
        sArray[7] = 2;
        id_case = sArray;
    }

    public boolean kickPlayer(UserConnection userConnection, String string) {
        return super.kickPlayer(userConnection, string);
    }

    public void onReload() {
    }

    public boolean isProxy() {
        return id_break[2];
    }

    public ViaAPI<UUID> getApi() {
        return (ViaAPI)this.id_class[id_case[6]];
    }

    public ViaVersionConfig getConf() {
        return (rrjV_2)((Object)this.id_class[id_case[4]]);
    }

    public JsonObject getDump() {
        if (rrjA_2.id_protected().id_class() == null) {
            return new JsonObject();
        }
        return rrjA_2.id_protected().id_class().get();
    }

    public /* synthetic */ PlatformTask runSync(Runnable runnable, long l) {
        return this.id_byte(runnable, l);
    }

    public /* synthetic */ PlatformTask runSync(Runnable runnable) {
        return this.id_break(runnable);
    }

    public boolean kickPlayer(UUID uUID, String string) {
        return id_break[1];
    }

    public boolean hasPlugin(String string) {
        return id_break[5];
    }

    public /* synthetic */ PlatformTask runAsync(Runnable runnable) {
        return this.id_class(runnable);
    }

    public String getPlatformVersion() {
        return id_throws[3];
    }

    public /* synthetic */ PlatformTask runRepeatingAsync(Runnable runnable, long l) {
        return this.id_break(runnable, l);
    }

    public boolean isPluginEnabled() {
        return id_break[3];
    }

    public void sendMessage(UUID uUID, String string) {
        if (uUID == null) {
            this.getLogger().info(string);
        } else {
            this.getLogger().info("[" + uUID + "] " + string);
        }
    }

    public /* synthetic */ PlatformTask runRepeatingSync(Runnable runnable, long l) {
        return this.id_class(runnable, l);
    }

    public ViaCommandSender[] getOnlinePlayers() {
        return new ViaCommandSender[id_break[0]];
    }

    public String getPlatformName() {
        return id_throws[2];
    }

    public String getPluginVersion() {
        return id_throws[1];
    }

    public ConfigurationProvider getConfigurationProvider() {
        return (rrjV_2)((Object)this.id_class[id_case[5]]);
    }

    public boolean isOldClientsAllowed() {
        return id_break[4];
    }

    public File getDataFolder() {
        return rrjA_2.id_protected().id_break();
    }

    public Collection<UnsupportedSoftware> getUnsupportedSoftwareClasses() {
        return super.getUnsupportedSoftwareClasses();
    }
}


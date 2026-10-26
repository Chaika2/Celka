package celestial;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.ViaAPI;
import com.viaversion.viaversion.api.command.ViaCommandSender;
import com.viaversion.viaversion.api.configuration.ConfigurationProvider;
import com.viaversion.viaversion.api.configuration.ViaVersionConfig;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.UnsupportedSoftware;
import com.viaversion.viaversion.api.platform.ViaPlatform;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
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

public class rrjI_2 implements ViaPlatform<UUID> {
   private static boolean[] id_break;
   public Object[] id_class;
   private static long[] id_byte;
   private static byte[] id_protected;
   private static String[] id_throws;
   private static short[] id_case;

   private static void id_byte() {
      id_throws = new String[]{new String("viaversion.yml"), new String("4.7.0"), new String("ViaVersion"), new String("${vialoadingbase_version}")};
   }

   public rrjK_2 id_byte(Runnable var1, long var2) {
      return new rrjK_2(Via.getManager().getScheduler().schedule(var1, var2 * id_byte[2], TimeUnit.MILLISECONDS));
   }

   public rrjI_2(Logger var1) {
      this.id_throws();
      rrjj_3 var7 = new rrjj_3();
      this.id_class[id_case[0]] = var7;
      File var2 = rrjA_2.id_protected().id_break();
      this.id_class[id_case[1]] = var1;
      rrjV_2 var9 = new rrjV_2(new File(var2, id_throws[0]));
      this.id_class[id_case[2]] = var9;
   }

   static {
      ntfClinit();
   }

   public rrjK_2 id_class(Runnable var1) {
      return new rrjK_2(Via.getManager().getScheduler().execute(var1));
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{60, 6, -37, 30, -77, 23, 31, 114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrjV_2 id_class() {
      return (rrjV_2)this.id_class[id_case[7]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6899147107975604407L;
   }

   public rrjK_2 id_class(Runnable var1, long var2) {
      return this.id_break(var1, var2);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1116413419;
   }

   public Logger getLogger() {
      return (Logger)this.id_class[id_case[3]];
   }

   public rrjK_2 id_break(Runnable var1, long var2) {
      return new rrjK_2(Via.getManager().getScheduler().scheduleRepeating(var1, id_byte[0], var2 * id_byte[1], TimeUnit.MILLISECONDS));
   }

   public rrjK_2 id_break(Runnable var1) {
      return this.id_class(var1);
   }

   public static List<ProtocolVersion> id_break() {
      List var0 = new ArrayList<>(ProtocolVersion.getProtocols())
         .stream()
         .filter(var0x -> var0x != ProtocolVersion.unknown && ProtocolVersion.getProtocols().indexOf(var0x) >= id_protected[0] ? id_break[6] : id_break[7])
         .collect(Collectors.toList());
      Collections.reverse(var0);
      return var0;
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[1]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_byte = new long[]{0L, 50L, 50L};
   }

   private static void id_case() {
      id_break = new boolean[]{false, false, true, true, true, false, true, false};
   }

   private static void id_protected() {
      id_protected = new byte[]{7, 3};
   }

   private static void id_private() {
      id_case = new short[]{0, 1, 2, 1, 2, 2, 0, 2};
   }

   public boolean kickPlayer(UserConnection var1, String var2) {
      return super.kickPlayer(var1, var2);
   }

   public void onReload() {
   }

   public boolean isProxy() {
      return id_break[2];
   }

   public ViaAPI<UUID> getApi() {
      return (ViaAPI<UUID>)this.id_class[id_case[6]];
   }

   public ViaVersionConfig getConf() {
      return (rrjV_2)this.id_class[id_case[4]];
   }

   public JsonObject getDump() {
      return rrjA_2.id_protected().id_class() == null ? new JsonObject() : rrjA_2.id_protected().id_class().get();
   }

   public boolean kickPlayer(UUID var1, String var2) {
      return id_break[1];
   }

   public boolean hasPlugin(String var1) {
      return id_break[5];
   }

   public String getPlatformVersion() {
      return id_throws[3];
   }

   public boolean isPluginEnabled() {
      return id_break[3];
   }

   public void sendMessage(UUID var1, String var2) {
      if (var1 == null) {
         this.getLogger().info(var2);
      } else {
         this.getLogger().info("[" + var1 + "] " + var2);
      }
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
      return (rrjV_2)this.id_class[id_case[5]];
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

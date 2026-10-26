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
   private static boolean[] break_;
   public Object[] class_;
   private static long[] byte_;
   private static byte[] protected_;
   private static String[] throws_;
   private static short[] case_;

   private static void byte_() {
      throws_ = new String[]{new String("viaversion.yml"), new String("4.7.0"), new String("ViaVersion"), new String("${vialoadingbase_version}")};
   }

   public rrjK_2 byte_(Runnable var1, long var2) {
      return new rrjK_2(Via.getManager().getScheduler().schedule(var1, var2 * 50L, TimeUnit.MILLISECONDS));
   }

   public rrjI_2(Logger var1) {
      this.throws_();
      rrjj_3 var7 = new rrjj_3();
      this.class_[0] = var7;
      File var2 = rrjA_2.protected_().break_();
      this.class_[1] = var1;
      rrjV_2 var9 = new rrjV_2(new File(var2, "viaversion.yml"));
      this.class_[2] = var9;
   }

   static {
      ntfClinit();
   }

   public rrjK_2 class_(Runnable var1) {
      return new rrjK_2(Via.getManager().getScheduler().execute(var1));
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{60, 6, -37, 30, -77, 23, 31, 114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrjV_2 class_() {
      return (rrjV_2)this.class_[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6899147107975604407L;
   }

   public rrjK_2 class_(Runnable var1, long var2) {
      return this.break_(var1, var2);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1116413419;
   }

   public Logger getLogger() {
      return (Logger)this.class_[1];
   }

   public rrjK_2 break_(Runnable var1, long var2) {
      return new rrjK_2(Via.getManager().getScheduler().scheduleRepeating(var1, 0L, var2 * 50L, TimeUnit.MILLISECONDS));
   }

   public rrjK_2 break_(Runnable var1) {
      return this.class_(var1);
   }

   public static List<ProtocolVersion> break_() {
      List var0 = new ArrayList<>(ProtocolVersion.getProtocols())
         .stream()
         .filter(var0x -> var0x != ProtocolVersion.unknown && ProtocolVersion.getProtocols().indexOf(var0x) >= 7 ? true : break_[7])
         .collect(Collectors.toList());
      Collections.reverse(var0);
      return var0;
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      byte_ = new long[]{0L, 50L, 50L};
   }

   private static void case_() {
      break_ = new boolean[]{false, false, true, true, true, false, true, false};
   }

   private static void protected_() {
      protected_ = new byte[]{7, 3};
   }

   private static void private_() {
      case_ = new short[]{0, 1, 2, 1, 2, 2, 0, 2};
   }

   public boolean kickPlayer(UserConnection var1, String var2) {
      return super.kickPlayer(var1, var2);
   }

   public void onReload() {
   }

   public boolean isProxy() {
      return true;
   }

   public ViaAPI<UUID> getApi() {
      return (ViaAPI<UUID>)this.class_[0];
   }

   public ViaVersionConfig getConf() {
      return (rrjV_2)this.class_[2];
   }

   public JsonObject getDump() {
      return rrjA_2.protected_().class_() == null ? new JsonObject() : rrjA_2.protected_().class_().get();
   }

   public boolean kickPlayer(UUID var1, String var2) {
      return false;
   }

   public boolean hasPlugin(String var1) {
      return false;
   }

   public String getPlatformVersion() {
      return "${vialoadingbase_version}";
   }

   public boolean isPluginEnabled() {
      return true;
   }

   public void sendMessage(UUID var1, String var2) {
      if (var1 == null) {
         this.getLogger().info(var2);
      } else {
         this.getLogger().info("[" + var1 + "] " + var2);
      }
   }

   public ViaCommandSender[] getOnlinePlayers() {
      return new ViaCommandSender[0];
   }

   public String getPlatformName() {
      return "ViaVersion";
   }

   public String getPluginVersion() {
      return "4.7.0";
   }

   public ConfigurationProvider getConfigurationProvider() {
      return (rrjV_2)this.class_[2];
   }

   public boolean isOldClientsAllowed() {
      return true;
   }

   public File getDataFolder() {
      return rrjA_2.protected_().break_();
   }

   public Collection<UnsupportedSoftware> getUnsupportedSoftwareClasses() {
      return super.getUnsupportedSoftwareClasses();
   }
}

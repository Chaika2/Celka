package celestial;

import com.viaversion.viaversion.ViaManagerImpl;
import com.viaversion.viaversion.ViaManagerImpl.ViaManagerBuilder;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocol.ProtocolManagerImpl;
import java.io.File;
import java.nio.charset.StandardCharsets;
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
   private static int[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   private static short[] throws_;
   private static String[] case_;
   public static Object[] break_;
   private static byte[] catch_;

   public static List<ProtocolVersion> byte_() {
      return new LinkedList<>(((Map)break_[4]).keySet());
   }

   private static void int_() {
      case_ = new String[]{
         new String("viaversion"),
         new String("com.viaversion.viabackwards.api.ViaBackwardsPlatform"),
         new String("ViaVersion"),
         new String("ViaVersion"),
         new String("ViaBackwards"),
         new String("${vialoadingbase_version}")
      };
   }

   public rrjA_2(
      LinkedList<rrjp_3> var1,
      File var2,
      int var3,
      BooleanSupplier var4,
      Supplier<JsonObject> var5,
      Consumer<ViaProviders> var6,
      Consumer<ViaManagerBuilder> var7,
      Consumer<rrjy_3> var8
   ) {
      this.else_();
      this.class_[0] = var1;
      File var14 = new File(var2, "viaversion");
      this.class_[1] = var14;
      Integer var15 = var3;
      this.class_[2] = var15;
      this.class_[3] = var4;
      this.class_[4] = var5;
      this.class_[5] = var6;
      this.class_[6] = var7;
      this.class_[7] = var8;
      break_[5] = this;
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      Object[] var0 = new Object[]{
         "${vialoadingbase_version}",
         new rrjo_3(LogManager.getLogger("ViaVersion")),
         new rrjp_3("ViaVersion", () -> true, () -> {
         }, var0x -> var0x.addAll(rrjI_2.break_())),
         new rrjp_3(
            "ViaBackwards",
            () -> class_("com.viaversion.viabackwards.api.ViaBackwardsPlatform"),
            () -> new rrjw_3(Via.getManager().getPlatform().getDataFolder())
         ),
         new LinkedHashMap(),
         null
      };
      break_ = var0;
   }

   public static boolean class_(String var0) {
      try {
         Class.forName(var0);
         return protected_[0];
      } catch (Exception var2) {
         return false;
      }
   }

   public void class_(ProtocolVersion var1) {
      this.class_(break_(var1));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6501500856859403325L;
   }

   public static rrjy_3 class_(int var0) {
      return ((Map)break_[4]).values().stream().filter(var1 -> var1.getVersion() == var0 ? true : protected_[3]).findFirst().orElse(null);
   }

   public void class_(rrjy_3 var1) {
      this.class_[9] = var1;
      if ((Consumer)this.class_[7] != null) {
         ((Consumer)this.class_[7]).accept((rrjy_3)this.class_[9]);
      }
   }

   public Supplier<JsonObject> class_() {
      return (Supplier<JsonObject>)this.class_[4];
   }

   public File break_() {
      return (File)this.class_[1];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1439313913;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{53, -121, -55, -9, -38, 95, -95, 125}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrjy_3 break_(ProtocolVersion var0) {
      return class_(var0.getVersion());
   }

   public rrjy_3 throws_() {
      return (BooleanSupplier)this.class_[3] != null && ((BooleanSupplier)this.class_[3]).getAsBoolean() ? (rrjy_3)this.class_[8] : (rrjy_3)this.class_[9];
   }

   private static void finally_() {
      protected_ = new boolean[]{true, false, true, false, true, true, false, false};
   }

   public List<rrjp_3> catch_() {
      return (LinkedList)this.class_[0];
   }

   public void case_() {
      for (rrjp_3 var2 : (LinkedList)this.class_[0]) {
         var2.class_();
      }

      for (ProtocolVersion var12 : (List)rrjp_3.break_[1]) {
         ((Map)break_[4]).put(var12, new rrjy_3(var12.getVersion(), var12.getName(), ((List)rrjp_3.break_[1]).indexOf(var12)));
      }

      rrjy_3 var8;
      rrjy_3 var10001 = var8 = break_(ProtocolVersion.getProtocol((Integer)this.class_[2]));
      this.class_[8] = var8;
      rrjy_3 var9 = var10001;
      this.class_[9] = var9;
      rrjI_2 var11 = new rrjI_2((Logger)break_[1]);
      ViaManagerBuilder var13 = ViaManagerImpl.builder().platform(var11).loader(new rrjR_2()).injector(new rrjg_3());
      if ((Consumer)this.class_[6] != null) {
         ((Consumer)this.class_[6]).accept(var13);
      }

      Via.init(var13.build());
      ViaManagerImpl var3 = (ViaManagerImpl)Via.getManager();
      var3.addEnableListener(() -> {
         for (rrjp_3 var2x : (LinkedList)this.class_[0]) {
            var2x.class_((Logger)break_[1]);
         }
      });
      var3.init();
      var3.onServerLoaded();
      var3.getProtocolManager().setMaxProtocolPathSize(Integer.MAX_VALUE);
      var3.getProtocolManager().setMaxPathDeltaIncrease(-1);
      ((ProtocolManagerImpl)var3.getProtocolManager()).refreshVersions();
   }

   private void else_() {
      if (this.class_ == null) {
         this.class_ = new Object[10];
         Object[] var1 = this.class_;
         var1[2] = 0;
      }
   }

   public int implements_() {
      return (Integer)this.class_[2];
   }

   private static void package_() {
      throws_ = new short[]{0, 1, 2, 3, 4, 5, 6, 7, 5, 3, 3, 8, 9, 9, 7, 7, 9, 0, 1, 4, 1, 2, 8, 9, 1, 6, 6, 5, 0, 1, 2, 4, 5, 4, 4, 4, 0, 1};
   }

   public static rrjA_2 protected_() {
      return (rrjA_2)break_[5];
   }

   public Consumer<ViaProviders> private_() {
      return (Consumer<ViaProviders>)this.class_[5];
   }

   private static void final_() {
      byte_ = new int[]{Integer.MAX_VALUE};
   }

   private static void native_() {
      catch_ = new byte[]{-1, 2, 3, 4, 10, 2, 6};
   }
}

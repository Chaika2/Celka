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
   private static int[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   private static short[] id_throws;
   private static String[] id_case;
   public static Object[] id_break;
   private static byte[] id_catch;

   public static List<ProtocolVersion> id_byte() {
      return new LinkedList<>(((Map)id_break[4]).keySet());
   }

   private static void id_int() {
      id_case = new String[]{
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
      this.id_else();
      this.id_class[0] = var1;
      File var14 = new File(var2, "viaversion");
      this.id_class[1] = var14;
      Integer var15 = var3;
      this.id_class[2] = var15;
      this.id_class[3] = var4;
      this.id_class[4] = var5;
      this.id_class[5] = var6;
      this.id_class[6] = var7;
      this.id_class[7] = var8;
      id_break[5] = this;
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      Object[] var0 = new Object[]{
         "${vialoadingbase_version}",
         new rrjo_3(LogManager.getLogger("ViaVersion")),
         new rrjp_3("ViaVersion", () -> true, () -> {
         }, var0x -> var0x.addAll(rrjI_2.id_break())),
         new rrjp_3(
            "ViaBackwards",
            () -> id_class("com.viaversion.viabackwards.api.ViaBackwardsPlatform"),
            () -> new rrjw_3(Via.getManager().getPlatform().getDataFolder())
         ),
         new LinkedHashMap(),
         null
      };
      id_break = var0;
   }

   public static boolean id_class(String var0) {
      try {
         Class.forName(var0);
         return id_protected[0];
      } catch (Exception var2) {
         return false;
      }
   }

   public void id_class(ProtocolVersion var1) {
      this.id_class(id_break(var1));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6501500856859403325L;
   }

   public static rrjy_3 id_class(int var0) {
      return ((Map)id_break[4]).values().stream().filter(var1 -> var1.getVersion() == var0 ? true : id_protected[3]).findFirst().orElse(null);
   }

   public void id_class(rrjy_3 var1) {
      this.id_class[9] = var1;
      if ((Consumer)this.id_class[7] != null) {
         ((Consumer)this.id_class[7]).accept((rrjy_3)this.id_class[9]);
      }
   }

   public Supplier<JsonObject> id_class() {
      return (Supplier<JsonObject>)this.id_class[4];
   }

   public File id_break() {
      return (File)this.id_class[1];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1439313913;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{53, -121, -55, -9, -38, 95, -95, 125}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrjy_3 id_break(ProtocolVersion var0) {
      return id_class(var0.getVersion());
   }

   public rrjy_3 id_throws() {
      return (BooleanSupplier)this.id_class[3] != null && ((BooleanSupplier)this.id_class[3]).getAsBoolean()
         ? (rrjy_3)this.id_class[8]
         : (rrjy_3)this.id_class[9];
   }

   private static void id_finally() {
      id_protected = new boolean[]{true, false, true, false, true, true, false, false};
   }

   public List<rrjp_3> id_catch() {
      return (LinkedList)this.id_class[0];
   }

   public void id_case() {
      for (rrjp_3 var2 : (LinkedList)this.id_class[0]) {
         var2.id_class();
      }

      for (ProtocolVersion var12 : (List)rrjp_3.id_break[1]) {
         ((Map)id_break[4]).put(var12, new rrjy_3(var12.getVersion(), var12.getName(), ((List)rrjp_3.id_break[1]).indexOf(var12)));
      }

      rrjy_3 var8;
      rrjy_3 var10001 = var8 = id_break(ProtocolVersion.getProtocol((Integer)this.id_class[2]));
      this.id_class[8] = var8;
      rrjy_3 var9 = var10001;
      this.id_class[9] = var9;
      rrjI_2 var11 = new rrjI_2((Logger)id_break[1]);
      ViaManagerBuilder var13 = ViaManagerImpl.builder().platform(var11).loader(new rrjR_2()).injector(new rrjg_3());
      if ((Consumer)this.id_class[6] != null) {
         ((Consumer)this.id_class[6]).accept(var13);
      }

      Via.init(var13.build());
      ViaManagerImpl var3 = (ViaManagerImpl)Via.getManager();
      var3.addEnableListener(() -> {
         for (rrjp_3 var2x : (LinkedList)this.id_class[0]) {
            var2x.id_class((Logger)id_break[1]);
         }
      });
      var3.init();
      var3.onServerLoaded();
      var3.getProtocolManager().setMaxProtocolPathSize(Integer.MAX_VALUE);
      var3.getProtocolManager().setMaxPathDeltaIncrease(-1);
      ((ProtocolManagerImpl)var3.getProtocolManager()).refreshVersions();
   }

   private void id_else() {
      if (this.id_class == null) {
         this.id_class = new Object[10];
         Object[] var1 = this.id_class;
         var1[2] = 0;
      }
   }

   public int id_implements() {
      return (Integer)this.id_class[2];
   }

   private static void id_package() {
      id_throws = new short[]{0, 1, 2, 3, 4, 5, 6, 7, 5, 3, 3, 8, 9, 9, 7, 7, 9, 0, 1, 4, 1, 2, 8, 9, 1, 6, 6, 5, 0, 1, 2, 4, 5, 4, 4, 4, 0, 1};
   }

   public static rrjA_2 id_protected() {
      return (rrjA_2)id_break[5];
   }

   public Consumer<ViaProviders> id_private() {
      return (Consumer<ViaProviders>)this.id_class[5];
   }

   private static void id_final() {
      id_byte = new int[]{Integer.MAX_VALUE};
   }

   private static void id_native() {
      id_catch = new byte[]{-1, 2, 3, 4, 10, 2, 6};
   }
}

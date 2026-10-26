package celestial;

import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwD_2 implements rrwj_3 {
   private static short[] class_;
   private static String[] break_;

   private rU_2 byte_(JsonObject var1) {
      return new rU_2(var1.get("x").getAsInt(), var1.get("y").getAsInt(), var1.get("z").getAsInt());
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 92681494;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5927657759944858425L;
   }

   private static void class_() {
      class_ = new short[2];
   }

   private JsonObject class_(rU_2 var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("x", var1.b_());
      var2.addProperty("y", var1.c_());
      var2.addProperty("z", var1.d_());
      return var2;
   }

   @Override
   public void class_(JsonObject var1) {
      if (var1.has("selection")) {
         JsonObject var2 = var1.getAsJsonObject("selection");
         rU_2 var3 = this.byte_(var2.getAsJsonObject("pos1"));
         rU_2 var4 = this.byte_(var2.getAsJsonObject("pos2"));
         CreeperFarm var5 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().i();
         bl_3 var6 = new bl_3(var3, var4);
         var5.class_(var6);
         var5.continue_().add(var6);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, -27, -12, 94, 84, 62, -8, -83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new String[]{
         new String("pos1"),
         new String("pos2"),
         new String("selection"),
         new String("selection"),
         new String("selection"),
         new String("pos1"),
         new String("pos2"),
         new String("x"),
         new String("y"),
         new String("z"),
         new String("x"),
         new String("y"),
         new String("z")
      };
   }

   @Override
   public void break_(JsonObject var1) {
      rY_2 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().i().new_();
      if (var2 != null) {
         JsonObject var3 = new JsonObject();
         var3.add("pos1", this.class_(var2.byte_()));
         var3.add("pos2", this.class_(var2.case_()));
         var1.add("selection", var3);
      }
   }
}

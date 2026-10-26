package celestial;

import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwD_2 implements rrwj_3 {
   private static short[] id_class;
   private static String[] id_break;

   private rU_2 id_byte(JsonObject var1) {
      return new rU_2(var1.get(id_break[10]).getAsInt(), var1.get(id_break[11]).getAsInt(), var1.get(id_break[12]).getAsInt());
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 92681494;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5927657759944858425L;
   }

   private static void id_class() {
      id_class = new short[2];
   }

   private JsonObject id_class(rU_2 var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty(id_break[7], var1.b_());
      var2.addProperty(id_break[8], var1.c_());
      var2.addProperty(id_break[9], var1.d_());
      return var2;
   }

   @Override
   public void id_class(JsonObject var1) {
      if (var1.has(id_break[3])) {
         JsonObject var2 = var1.getAsJsonObject(id_break[4]);
         rU_2 var3 = this.id_byte(var2.getAsJsonObject(id_break[5]));
         rU_2 var4 = this.id_byte(var2.getAsJsonObject(id_break[6]));
         CreeperFarm var5 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_class[1]]).id_private().i();
         bl_3 var6 = new bl_3(var3, var4);
         var5.id_class(var6);
         var5.id_continue().add(var6);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, -27, -12, 94, 84, 62, -8, -83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new String[]{
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
   public void id_break(JsonObject var1) {
      rY_2 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_class[0]]).id_private().i().id_new();
      if (var2 != null) {
         JsonObject var3 = new JsonObject();
         var3.add(id_break[0], this.id_class(var2.id_byte()));
         var3.add(id_break[1], this.id_class(var2.id_case()));
         var1.add(id_break[2], var3);
      }
   }
}

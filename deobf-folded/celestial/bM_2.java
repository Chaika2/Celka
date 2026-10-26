package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bM_2 {
   private static byte[] id_class;
   private static short[] id_byte;
   public Object[] id_break;

   public void id_byte(bb_3 var1) {
      ((C_class)this.id_break[id_byte[9]]).s().id_break(var1);
   }

   public void id_byte() {
      ((List)this.id_break[1]).stream().filter(bb_3::id_protected).forEach(bb_3::id_class);
      this.id_catch();
   }

   public bM_2(C_class var1) {
      this.id_finally();
      this.id_break[id_byte[0]] = var1;
      ArrayList var7 = new ArrayList();
      this.id_break[1] = var7;
   }

   static {
      ntfClinit();
   }

   public void id_class(bb_3 var1) {
      ((List)this.id_break[1]).add(var1);
   }

   public void id_class(bb_3 var1, rVi_1 var2) {
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1536281694;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6539916770906087371L;
   }

   public void id_class() {
      U var1 = ((C_class)this.id_break[id_byte[6]]).s();

      for (bb_3 var3 : (List)this.id_break[1]) {
         var1.id_break(var3);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-54, 98, -89, 121, -2, -60, -75, 96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_break(bb_3 var1) {
      ((C_class)this.id_break[id_byte[8]]).s().id_class(var1);
   }

   public List<bb_3> id_break() {
      return (List<bb_3>)this.id_break[1];
   }

   public C_class id_throws() {
      return (C_class)this.id_break[id_byte[10]];
   }

   private void id_finally() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   public void id_catch() {
   }

   public void id_case() {
      U var1 = ((C_class)this.id_break[id_byte[4]]).s();

      for (bb_3 var3 : (List)this.id_break[1]) {
         var1.id_class(var3);
      }
   }

   private static void id_implements() {
      id_byte = new short[]{0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1};
   }

   public void id_protected() {
   }

   private static void id_private() {
      id_class = new byte[]{2};
   }
}

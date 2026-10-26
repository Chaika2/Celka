package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCw_1 extends rrTF<Velocity> {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_break = new boolean[]{true, true, false, false, true, false, false};
   }

   public rrCw_1(Velocity var1) {
      super(var1);
      this.id_break();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1748116245440440331L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-88, 76, -95, -13, 64, -76, 70, -39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_break();
      if (var1.id_class() instanceof rvc_3 var3) {
         if ((cb_3)id_import.id_class[id_byte[0]] != null && var3.id_break() == ((cb_3)id_import.id_class[id_byte[1]]).V()) {
            Boolean var8 = id_break[0];
            this.id_class[id_byte[2]] = var8;
         }
      }
   }

   @EventTarget
   public void id_class(rrAO var1) {
      this.id_break();
      if ((Boolean)this.id_class[id_byte[3]]) {
         var1.id_break(id_break[1]);
         Boolean var6 = id_break[2];
         this.id_class[id_byte[4]] = var6;
      }
   }

   private static void id_class() {
      id_byte = new short[]{57, 57, 0, 0, 0, 0};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -948733648;
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         this.id_class[0] = false;
      }
   }

   @Override
   public boolean aK_() {
      this.id_break();
      Boolean var5 = id_break[3];
      this.id_class[id_byte[5]] = var5;
      return super.aK_();
   }
}

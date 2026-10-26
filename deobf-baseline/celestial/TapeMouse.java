package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TapeMouse extends Module {
   private static byte[] id_byte;
   private static float[] id_protected;
   private static short[] id_throws;
   public Object[] id_break;
   private static boolean[] id_catch;
   private static String[] id_private;

   public TapeMouse() {
      super(id_private[0], id_private[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_throws[0]]);
      this.id_return();
      String var10003 = id_private[2];
      String var10004 = id_private[3];
      String[] var10005 = new String[id_byte[0]];
      var10005[id_catch[0]] = id_private[4];
      var10005[id_catch[1]] = id_private[5];
      rrIQ var5 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_throws[1]] = var5;
      rrIm_1 var6 = new rrIm_1(id_private[6], id_protected[0], id_protected[1], id_protected[2], id_protected[3]);
      this.id_break[id_throws[2]] = var6;
      rrfw_3 var7 = new rrfw_3();
      this.id_break[id_throws[3]] = var7;
      Setting[] var10001 = new Setting[id_byte[1]];
      var10001[id_catch[2]] = (rrIQ)this.id_break[id_throws[4]];
      var10001[id_catch[3]] = (rrIm_1)this.id_break[id_throws[5]];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_private = new String[]{
         new String("Tape Mouse"),
         new String("Автоматически нажимает левую\nили правую кнопку мыши"),
         new String("Режим"),
         new String("ЛКМ"),
         new String("ЛКМ"),
         new String("ПКМ"),
         new String("Задержка в секундах"),
         new String("ЛКМ")
      };
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 296301507;
   }

   @EventTarget
   public void id_class(rrAm_1 var1) {
      var1.id_class(id_catch[4]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5593851194299067641L;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[6]]
         && ((rrfw_3)this.id_break[id_throws[7]]).id_class((double)(((rrIm_1)this.id_break[id_throws[8]]).id_byte() * id_protected[4]))) {
         if (((rrIQ)this.id_break[id_throws[9]]).id_byte().equals(id_private[7])) {
            id_import.z();
         } else {
            id_import.id_for();
         }

         ((rrfw_3)this.id_break[id_throws[10]]).id_class();
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{65, 22, 98, 73, -79, 78, -117, 110}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_return();
      super.id_throws(var1);
      ((rrfw_3)this.id_break[id_throws[11]]).id_class();
   }

   private static void id_continue() {
      id_throws = new short[]{0, 0, 1, 2, 0, 1, 0, 2, 1, 0, 2, 2};
   }

   private static void id_else() {
      id_protected = new float[]{0.5F, 0.0F, 60.0F, 0.5F, 1000.0F};
   }

   private static void id_new() {
      id_byte = new byte[]{2, 2, 3};
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
      }
   }

   private static void id_super() {
      id_catch = new boolean[]{false, true, false, true, true};
   }
}

package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BlocksLift extends Module implements rrnZ_2 {
   private static byte[] id_byte;
   private static double[] id_protected;
   private static short[] id_throws;
   public Object[] id_break;
   private static boolean[] id_catch;
   private static String[] id_private;

   public BlocksLift() {
      super("Blocks Lift", "Позволяет подниматься в блоках", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.id_super();
      rrIQ var5 = new rrIQ("Режим", "Packet", "Packet", "Glide", "Matrix");
      this.id_break[0] = var5;
      rrfw_3 var6 = new rrfw_3();
      this.id_break[1] = var6;
      this.id_class((rrIQ)this.id_break[0]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new double[]{0.0, 0.0, -0.01, 150.0, 0.42, 300.0, 0.42};
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_super();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         String var2 = ((rrIQ)this.id_break[0]).id_byte();
         switch (var2) {
            case "Glide":
               if (((cb_3)id_import.id_class[57]).BW()
                  && !((cb_3)id_import.id_class[57]).id_class(QP.id_class)
                  && ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private) {
                  if ((Integer)((cb_3)id_import.id_class[57]).id_throws[41] % 2 == 0) {
                     ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rZO(true));
                  }

                  if (((cb_3)id_import.id_class[57]).BL()) {
                     ((cb_3)id_import.id_class[57]).sl();
                  } else {
                     ((cb_3)id_import.id_class[57]).rv().id_break = 0.0;
                     ((cb_3)id_import.id_class[57]).rv().id_protected = 0.0;
                     ((cb_3)id_import.id_class[57]).rv().id_byte = -0.01;
                  }
               }
               break;
            case "Packet":
               if (((cb_3)id_import.id_class[57]).BW()
                  && !((cb_3)id_import.id_class[57]).BL()
                  && !((cb_3)id_import.id_class[57]).id_class(QP.id_class)
                  && ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private) {
                  rrfj_3.id_class(true);
                  if (((rrfw_3)this.id_break[1]).id_class(150.0)) {
                     ((cb_3)id_import.id_class[57]).rv().id_byte = 0.42;
                     ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(new rZO(true));
                  }

                  if (((rrfw_3)this.id_break[1]).id_class(300.0)) {
                     ((rrfw_3)this.id_break[1]).id_class();
                  }

                  Boolean var8 = true;
                  this.id_break[2] = var8;
               } else if ((Boolean)this.id_break[2]) {
                  Boolean var9 = false;
                  this.id_break[2] = var9;
               }
               break;
            case "Matrix":
               if (((cb_3)id_import.id_class[57]).BW() && ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private) {
                  rrIU.id_class();
                  ((cb_3)id_import.id_class[57]).rv().id_byte = 0.42;
                  if ((Integer)((cb_3)id_import.id_class[57]).id_throws[41] % 2 == 0) {
                     ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rZO(true));
                  }
               }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7426730992217074188L;
   }

   @Override
   public void id_class() {
      this.id_byte(false);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1201437588;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, -15, -85, 80, -44, 41, 118, 91}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_super();
      super.id_throws(var1);
      Boolean var6 = false;
      this.id_break[2] = var6;
      ((rrfw_3)this.id_break[1]).id_class();
   }

   private static void id_continue() {
      id_byte = new byte[]{3, 2, -1, 2, 2, 2, 3, 2};
   }

   private static void id_else() {
      id_catch = new boolean[]{false, true, false, true, true, true, true, true, false, true, false, false, false};
   }

   private static void id_new() {
      id_throws = new short[]{
         1,
         0,
         1,
         0,
         0,
         0,
         57,
         57,
         57,
         17,
         57,
         41,
         57,
         0,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         17,
         1,
         57,
         57,
         0,
         1,
         1,
         2,
         2,
         2,
         57,
         57,
         17,
         57,
         57,
         41,
         57,
         0,
         2,
         1
      };
   }

   private static void id_return() {
      id_private = new String[]{
         new String("Blocks Lift"),
         new String("Позволяет подниматься в блоках"),
         new String("Режим"),
         new String("Packet"),
         new String("Packet"),
         new String("Glide"),
         new String("Matrix"),
         new String("Glide"),
         new String("Packet"),
         new String("Matrix")
      };
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         this.id_break[2] = false;
      }
   }
}

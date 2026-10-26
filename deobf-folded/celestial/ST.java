package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ST extends Sv_1 {
   private static String[] id_protected;
   private static short[] id_throws;
   private static float[] id_case;
   public static Object[] id_break;
   private static long[] id_catch;
   private static double[] id_private;
   public Object[] id_byte;
   private static byte[] id_implements;
   private static boolean[] id_finally;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{34, -70, 112, 120, -20, -107, -89, -122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_byte() {
      super.id_byte();
      this.id_private();
   }

   private boolean id_int() {
      String var1 = this.id_final();
      return var1 != null && var1.contains(id_protected[4]) ? true : id_finally[14];
   }

   public ST(SL var1) {
      super(var1);
      this.id_volatile();
      rrfw_3 var6 = new rrfw_3();
      this.id_byte[id_throws[0]] = var6;
      rrfw_3 var7 = new rrfw_3();
      this.id_byte[1] = var7;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new long[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 46404849;
   }

   @Override
   public void id_class(rrAM var1) {
      this.id_volatile();
      super.id_class(var1);
      this.id_case().id_class();
      ((rrfw_3)this.id_byte[1]).id_class();
   }

   private rdn_3 id_class(rqs_3<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.id_continue().id_byte().toLowerCase();
         if (var4.contains(id_protected[6])) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public void id_class(rrLO var1) {
      super.id_class(var1);
      String var2 = var1.id_protected();
      if (Arrays.<String>stream((String[])id_break[id_throws[8]]).anyMatch(var1x -> var2.toLowerCase().contains(var1x.toLowerCase()))) {
         this.id_private();
      }
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_volatile();
      super.id_class(var1);
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[2]]) {
         SC var2 = this.id_case().id_catch();
         if (var2 == null) {
            return;
         }

         if (var2 instanceof SF var3) {
            long var4 = var3.id_class();
            if (var4 > id_catch[0] && !((rrfw_3)this.id_byte[1]).id_class((double)var4)) {
               return;
            }
         }

         if (!this.id_implements()) {
            return;
         }

         vm_3 var10 = (vm_3)id_import.id_class[73];
         if (var10 instanceof Fc_1 var9) {
            String var11 = this.id_final();
            rqs_3 var5 = var9.G_().id_extends();
            rdn_3 var6 = this.id_class(var2, var5);
            if (var11 == null) {
               return;
            }

            String var7 = var2.id_byte();
            if (var7.equalsIgnoreCase(id_protected[0]) || var7.equalsIgnoreCase(id_protected[1])) {
               rdn_3 var8 = this.id_class(var5);
               if (var8 != null) {
                  this.id_class(var5.indexOf(var8), id_finally[2]);
                  return;
               }
            }

            if (var11.contains(id_protected[2])) {
               rdn_3 var12 = this.id_break(var5);
               if (var12 != null) {
                  this.id_class(var5.indexOf(var12), id_finally[3]);
                  return;
               }
            }

            if (var6 != null) {
               this.id_class(var5.indexOf(var6), true);
            } else if (var11.contains(id_protected[3])) {
               this.id_private();
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8372644447437334382L;
   }

   @Override
   public void id_class(rrAl_1 var1) {
      this.id_volatile();
      super.id_class(var1);
      if (var1.id_class() > 10.0F && (Boolean)this.id_byte[2]) {
         this.id_private();
         Boolean var6 = id_finally[5];
         this.id_byte[2] = var6;
      }
   }

   private rdn_3 id_class(SC var1, List<rdn_3> var2) {
      try {
         int var3 = Integer.parseInt(var1.id_byte());

         for (rdn_3 var5 : var2) {
            if (!var5.id_class() && var5.id_continue().id_byte().contains("#" + var3)) {
               return var5;
            }
         }

         return null;
      } catch (NumberFormatException var6) {
         return null;
      }
   }

   private void id_class(int var1, boolean var2) {
      this.id_volatile();
      if (((rrfw_3)this.id_byte[id_throws[24]]).id_class(200.0)) {
         ((Ax_1)id_import.id_class[55]).id_class(((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case, var1, 1, rXa_1.PICKUP);
         if (var2) {
            Boolean var7 = id_finally[12];
            this.id_byte[2] = var7;
         }

         ((rrfw_3)this.id_byte[id_throws[29]]).id_class();
      }
   }

   @Override
   public boolean id_break(String var1) {
      return !rql_3.id_break(var1) ? true : id_finally[1];
   }

   private rdn_3 id_break(rqs_3<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.id_continue().id_byte().toLowerCase();
         if (var4.contains(id_protected[5])) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public String id_throws() {
      return C_throws.id_byte().id_final().id_throws();
   }

   private static void id_finally() {
      id_case = new float[]{10.0F};
   }

   private static void id_extends() {
      id_private = new double[]{200.0};
   }

   private static void id_continue() {
      id_throws = new short[]{0, 1, 0, 1, 73, 2, 2, 1, 0, 2, 73, 73, 2, 57, 1, 2, 57, 41, 57, 0, 57, 1, 57, 0, 0, 55, 57, 4, 2, 0, 73, 0, 2};
   }

   private boolean id_implements() {
      this.id_volatile();
      if (this.id_int()) {
         Boolean var6 = true;
         this.id_byte[2] = var6;
         return true;
      } else {
         if ((vm_3)id_import.id_class[73] != null && ((vm_3)id_import.id_class[73]).id_throw() > 2) {
            Boolean var7 = id_finally[8];
            this.id_byte[2] = var7;
         }

         int var1 = rrfY_2.id_break(rdy_3.Xx);
         if (var1 == -1) {
            return id_finally[9];
         } else {
            if (var1 >= 0) {
               ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected = var1;
            } else if (!(Boolean)this.id_byte[2] && (Integer)((cb_3)id_import.id_class[57]).id_throws[41] % 5 == 0) {
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_throws[19]])
                  .id_break(new rme_3(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected));
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_throws[23]]).id_break(new rZd_1(var1 == -2 ? rpm_3.MAIN_HAND : rpm_3.OFF_HAND));
            }

            return id_finally[10];
         }
      }
   }

   private static void id_new() {
      id_implements = new byte[]{2, -1, 5, -2, 3, 2, 3, 2};
   }

   private static void id_package() {
      Object[] var0 = new Object[1];
      String[] var2 = new String[]{id_protected[7], id_protected[8], id_protected[9]};
      var0[0] = var2;
      id_break = var0;
   }

   private static void id_super() {
      id_finally = new boolean[]{
         true, false, false, false, true, false, true, true, false, false, false, true, false, true, false, false, false, true, false, false, true
      };
   }

   private void id_private() {
      this.id_volatile();
      ((rrfw_3)this.id_byte[id_throws[31]]).id_class();
      Boolean var5 = id_finally[15];
      this.id_byte[2] = var5;
   }

   private String id_final() {
      vm_3 var2 = (vm_3)id_import.id_class[73];
      return var2 instanceof Fc_1 var1 ? var1.id_new().id_byte().toLowerCase() : null;
   }

   private void id_volatile() {
      if (this.id_byte == null) {
         this.id_byte = new Object[3];
         Object[] var1 = this.id_byte;
         var1[2] = id_finally[19];
      }
   }

   private static void id_native() {
      id_protected = new String[]{
         new String("mega"),
         new String("мега"),
         new String("выбор сервера"),
         new String("выбор мира грифа"),
         new String("выбор"),
         new String("гриферское выживание"),
         new String("мега гриф"),
         new String("К сожалению сервер переполнен."),
         new String("На сервер заходит большой поток игроков."),
         new String("Вы уже подключаетесь к серверу!")
      };
   }
}

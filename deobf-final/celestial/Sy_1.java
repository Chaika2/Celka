package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sy_1 extends Sv_1 {
   private static boolean[] byte_;
   private static String[] protected_;
   private static long[] throws_;
   private static short[] case_;
   public Object[] break_;
   private static byte[] catch_;

   @Override
   public void byte_() {
      this.private_();
      super.byte_();
      Boolean var5 = false;
      this.break_[0] = var5;
      Object var6 = null;
      this.break_[2] = var6;
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{124, -47, -116, 106, 3, -18, 23, -64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Sy_1(SL var1) {
      super(var1);
      this.private_();
      rrfw_3 var6 = new rrfw_3();
      this.break_[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -613907244444038808L;
   }

   private Sp_1 class_(PK var1, List<rdn_3> var2) {
      String var3 = var1.class_();

      for (rdn_3 var5 : var2) {
         if (var5.break_() == rdy_3.dq) {
            String var6 = var5.continue_().byte_();
            if (var6.contains(var3)) {
               return new Sp_1(this, var5, (Sq_1)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[1]);
            }
         }
      }

      return null;
   }

   @Override
   public void class_(SC var1) {
      this.private_();
      super.class_(var1);
      Po_1 var6 = Po_1.break_(var1.byte_());
      this.break_[2] = var6;
      if ((Po_1)this.break_[2] == null) {
         this.byte_();
      }
   }

   private Sp_1 class_(Po_1 var1, List<rdn_3> var2) {
      String var3 = "#" + var1.class_();
      boolean var4 = false;

      for (rdn_3 var6 : var2) {
         if (var6.break_() == rdy_3.dJ) {
            var4 = true;

            for (rgP_2 var9 : var6.class_(null, VU.NORMAL)) {
               String var10 = var9.getString();
               if (var10.contains("#")) {
                  String var11 = var10.substring(var10.indexOf(35));
                  if (var11.equals(var3)) {
                     return new Sp_1(this, var6, (Sq_1)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[1]);
                  }
               }
            }
         }
      }

      return var4 ? new Sp_1(this, null, (Sq_1)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[0]) : null;
   }

   @Override
   public void class_(rrAM var1) {
      this.private_();
      super.class_(var1);
      SL var2 = this.case_();
      SC var3 = var2.catch_();
      if (var3 != null) {
         this.case_().class_();
      }

      ((rrfw_3)this.break_[1]).class_();
   }

   @Override
   public void class_(q_1 var1) {
      this.private_();
      super.class_(var1);
      if ((Po_1)this.break_[2] != null) {
         if (this.case_().catch_() instanceof SF var3) {
            long var4 = var3.class_();
            if (var4 > 0L && !((rrfw_3)this.break_[1]).class_((double)var4)) {
               return;
            }
         }

         PK var20 = ((Po_1)this.break_[2]).break_();
         boolean var21 = var20.protected_();
         boolean var5 = var20.byte_();
         boolean var6 = var20.throws_();
         vm_3 var8 = (vm_3)import_.class_[73];
         if (var8 instanceof Fc_1 var7) {
            String var22 = var7.new_().byte_();
            rqs_3 var9 = var7.G_().extends_();
            boolean var10 = false;
            if (var21) {
               var10 = var22.equalsIgnoreCase("Выбор Лайт анархии:");
            } else if (var5) {
               var10 = var22.equalsIgnoreCase("Выберите сервер Лайт:");
            } else if (var6) {
               var10 = var22.equalsIgnoreCase("Выберите Классич. Анархию:");
            }

            if (var10) {
               Sp_1 var11 = this.class_((Po_1)this.break_[2], var9);
               if (var11 != null) {
                  Sq_1 var12 = var11.break_();
                  if (var12 == (Sq_1)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[0]) {
                     rrfu_3.byte_("Не удалось найти режим '" + ((Po_1)this.break_[2]).break_().class_() + ((Po_1)this.break_[2]).class_() + "'");
                     this.byte_();
                  } else if (var12 == (Sq_1)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[1]) {
                     rdn_3 var13 = var11.class_();
                     if (var13 != null) {
                        ((Ax_1)import_.class_[55]).class_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var9.indexOf(var13), 1, rXa_1.PICKUP);
                     }
                  }
               } else if (var20.protected_()) {
                  Sp_1 var23 = this.class_(var20, var9);
                  if (var23 != null) {
                     rdn_3 var24 = var23.class_();
                     if (var24 != null) {
                        ((Ax_1)import_.class_[55]).class_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var9.indexOf(var24), 1, rXa_1.PICKUP);
                     }
                  }
               }
            }
         } else {
            if ((Integer)((cb_3)import_.class_[57]).throws_[41] % 20 == 0) {
               Boolean var18 = false;
               this.break_[0] = var18;
            }

            if (!(Boolean)this.break_[0] && !this.break_(this.break_())) {
               if (var21) {
                  ((cb_3)import_.class_[57]).case_("/lite");
               } else if (var5) {
                  ((cb_3)import_.class_[57]).case_("/lite120");
               } else if (var6) {
                  ((cb_3)import_.class_[57]).protected_("/anarchy");
               }

               Boolean var19 = true;
               this.break_[0] = var19;
            }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1999677907;
   }

   @Override
   public boolean break_(String var1) {
      Po_1 var2 = Po_1.break_(var1);
      if (var2 != null) {
         PK var3 = var2.break_();
         if (var3 != null) {
            return var3.break_();
         }
      }

      return byte_[0];
   }

   @Override
   public String throws_() {
      Po_1 var1 = C_throws.byte_().P().break_();
      if (var1 != null) {
         PK var2 = var1.break_();
         if (var2 != null) {
            return var2.class_() + var1.class_();
         }
      }

      return null;
   }

   private static void finally_() {
      catch_ = new byte[]{20, 35, 3};
   }

   private static void extends_() {
      throws_ = new long[1];
   }

   private static void implements_() {
      protected_ = new String[]{
         new String("/lite"),
         new String("/lite120"),
         new String("/anarchy"),
         new String("Выбор Лайт анархии:"),
         new String("Выберите сервер Лайт:"),
         new String("Выберите Классич. Анархию:"),
         new String("#")
      };
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
         var1[0] = false;
      }
   }

   private static void volatile_() {
      byte_ = new boolean[]{false, false, false, true, false, true, true, false, true, false, false};
   }

   private static void native_() {
      case_ = new short[]{1, 0, 2, 2, 2, 1, 2, 1, 2, 73, 57, 41, 0, 0, 57, 57, 57, 0, 2, 0, 2, 2, 1, 55, 57, 4, 55, 57, 4, 1, 1, 0};
   }
}

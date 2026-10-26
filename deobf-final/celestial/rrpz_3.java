package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpz_3 extends rrTF<FtHelper> {
   private static String[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static boolean[] case_;
   public Object[] class_;

   private static void byte_() {
      case_ = new boolean[]{true, true, false, true, true, true, true, true, true, false, true};
   }

   public rrpz_3(FtHelper var1, GroupSetting var2) {
      super(var1);
      this.implements_();
      ArrayList var7 = new ArrayList();
      this.class_[0] = var7;
      rrIk_1 var8 = new rrIk_1("Выделять предметы на\nаукционе", true);
      this.class_[1] = var8;
      rrIk_1 var9 = new rrIk_1("Выделять если\nнедостаточно денег для\nпокупки", true).class_(() -> {
         this.implements_();
         return ((rrIk_1)this.class_[1]).class_();
      });
      this.class_[2] = var9;
      rrIz_1 var10 = new rrIz_1("Цвет самого дешёвого\nпредмета", Color.GREEN.getRGB()).class_(() -> {
         this.implements_();
         return ((rrIk_1)this.class_[1]).class_();
      });
      this.class_[3] = var10;
      rrIz_1 var11 = new rrIz_1("Цвет предмета который\nкупит автобай", Color.BLUE.getRGB()).class_(() -> {
         this.implements_();
         return ((rrIk_1)this.class_[1]).class_();
      });
      this.class_[4] = var11;
      rrIz_1 var12 = new rrIz_1("Цвет самого дешёвого\nпредмета который купит\nавтобай", Color.CYAN.getRGB()).class_(() -> {
         this.implements_();
         return ((rrIk_1)this.class_[1]).class_();
      });
      this.class_[5] = var12;
      var2.class_((rrIk_1)this.class_[1], (rrIk_1)this.class_[2], (rrIz_1)this.class_[3], (rrIz_1)this.class_[4], (rrIz_1)this.class_[5]);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrAD var1) {
      this.implements_();
      Ml_1 var2 = var1.break_();
      rJY var3 = var1.case_();
      if (var3.break_()) {
         int var4 = var1.byte_();
         int var5 = var1.throws_();
         int var6 = var1.protected_();
         int var7 = var1.class_();

         for (rrpQ_2 var9 : (List)this.class_[0]) {
            rrNt_1 var10 = var9.byte_();
            if (var3.equals(var10.throws_())) {
               int var11 = Color.WHITE.getRGB();
               if (var9.break_()) {
                  var11 = ((rrIz_1)this.class_[3]).byte_();
               } else if (var9.class_()) {
                  var11 = ((rrIz_1)this.class_[5]).byte_();
               } else if (var9.protected_()) {
                  var11 = ((rrIz_1)this.class_[4]).byte_();
               }

               rrfD_2.protected_(var2, (float)var4, (float)var5, (float)var6, (float)var7, var11);
            }
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-73, -42, 101, -109, -104, 56, -30, 50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 392205082;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4717497231749322278L;
   }

   private <T> Comparator<T> class_(Function<T, rrNt_1> var1) {
      return Comparator.comparingDouble(var1x -> {
         rrNt_1 var2 = (rrNt_1)var1.apply((T)var1x);
         double var3 = (double)Math.max(1, var2.case_());
         double var5 = (double)Math.max(1, var2.throws_().class_().char_());
         return var3 / var5;
      });
   }

   @EventTarget
   public void class_(rrAT var1) {
      this.implements_();
      if (var1.class_() instanceof rXe_1) {
         if (((rrIk_1)this.class_[1]).class_()) {
            if (!((List)this.class_[0]).isEmpty()) {
               ((List)this.class_[0]).clear();
            }

            rrNW var2 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).throws_();
            long var3 = C_throws.byte_().native_().byte_();
            if (!var2.case_() && var2.byte_(var2.switch_())) {
               List var5 = var2.int_();
               List var6 = var2.synchronized_();
               if (!var5.isEmpty() && !var6.isEmpty()) {
                  ArrayList var7 = new ArrayList();
                  boolean var8 = ((rrIk_1)this.class_[2]).class_();

                  for (rJY var10 : var5) {
                     rrNt_1 var11 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[0]).break_(var10);
                     if (var11 != null) {
                        String var12 = var11.catch_();
                        int var13 = var11.case_();
                        if (var13 != -1 && var12 != null && !var12.equals(import_.while_().byte_()) && (var8 || var3 >= (long)var13)) {
                           var7.add(var11);
                        }
                     }
                  }

                  if (!var7.isEmpty()) {
                     ArrayList var18 = new ArrayList();

                     for (rrNt_1 var21 : var7) {
                        var21.class_(var21.throws_().class_());
                        var21.class_(var6);
                        var21.break_(var5);
                        var18.add(var21);
                     }

                     Comparator var20 = this.extends_();
                     Comparator var22 = this.throws_();
                     rrNt_1 var23 = (rrNt_1)var18.stream().min(var20).orElse(null);
                     ArrayList var24 = new ArrayList();

                     for (rrNt_1 var15 : var18) {
                        if (var23 != null && var15.equals(var23)) {
                           ((List)this.class_[0]).add(new rrpQ_2(var15).byte_(true));
                        } else {
                           for (rrNd_1 var17 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).protected_()) {
                              if (var17.while_() && var17.class_(var15, var1x -> var1x instanceof rrcj_3 && var8 ? false : case_[10])) {
                                 var24.add(new rrpQ_2(var15).class_(true));
                                 break;
                              }
                           }
                        }
                     }

                     rrpQ_2 var25 = (rrpQ_2)var24.stream().min(var22).orElse(null);

                     for (rrpQ_2 var27 : var24) {
                        if (var25 != null && var27.equals(var25)) {
                           var27.break_(true);
                        }

                        ((List)this.class_[0]).add(var27);
                     }
                  }
               }
            }
         }
      }
   }

   private static void break_() {
      break_ = new String[]{
         new String("Выделять предметы на\nаукционе"),
         new String("Выделять если\nнедостаточно денег для\nпокупки"),
         new String("Цвет самого дешёвого\nпредмета"),
         new String("Цвет предмета который\nкупит автобай"),
         new String("Цвет самого дешёвого\nпредмета который купит\nавтобай")
      };
   }

   private Comparator<rrpQ_2> throws_() {
      return this.class_(rrpQ_2::byte_);
   }

   private static void finally_() {
      byte_ = new byte[]{5, 2, 3, 4, -1, 6};
   }

   private Comparator<rrNt_1> extends_() {
      return this.class_(Function.identity());
   }

   private static void case_() {
      protected_ = new short[]{0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 3, 5, 4, 0, 1, 1, 1, 1};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
      }
   }

   @Override
   public boolean aK_() {
      this.implements_();
      ((List)this.class_[0]).clear();
      return super.aK_();
   }
}

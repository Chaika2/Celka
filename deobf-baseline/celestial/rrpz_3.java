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
   private static String[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_case;
   public Object[] id_class;

   private static void id_byte() {
      id_case = new boolean[]{true, true, false, true, true, true, true, true, true, false, true};
   }

   public rrpz_3(FtHelper var1, GroupSetting var2) {
      super(var1);
      this.id_implements();
      ArrayList var7 = new ArrayList();
      this.id_class[id_protected[0]] = var7;
      rrIk_1 var8 = new rrIk_1(id_break[0], id_case[0]);
      this.id_class[id_protected[1]] = var8;
      rrIk_1 var9 = new rrIk_1(id_break[1], id_case[1]).id_class(() -> {
         this.id_implements();
         return ((rrIk_1)this.id_class[id_protected[28]]).id_class();
      });
      this.id_class[id_protected[2]] = var9;
      rrIz_1 var10 = new rrIz_1(id_break[2], Color.GREEN.getRGB()).id_class(() -> {
         this.id_implements();
         return ((rrIk_1)this.id_class[id_protected[27]]).id_class();
      });
      this.id_class[id_protected[3]] = var10;
      rrIz_1 var11 = new rrIz_1(id_break[3], Color.BLUE.getRGB()).id_class(() -> {
         this.id_implements();
         return ((rrIk_1)this.id_class[id_protected[26]]).id_class();
      });
      this.id_class[id_protected[4]] = var11;
      rrIz_1 var12 = new rrIz_1(id_break[4], Color.CYAN.getRGB()).id_class(() -> {
         this.id_implements();
         return ((rrIk_1)this.id_class[id_protected[25]]).id_class();
      });
      this.id_class[id_protected[5]] = var12;
      Setting[] var10001 = new Setting[id_byte[0]];
      var10001[id_case[2]] = (rrIk_1)this.id_class[id_protected[6]];
      var10001[id_case[3]] = (rrIk_1)this.id_class[id_protected[7]];
      var10001[id_byte[1]] = (rrIz_1)this.id_class[id_protected[8]];
      var10001[id_byte[2]] = (rrIz_1)this.id_class[id_protected[9]];
      var10001[id_byte[3]] = (rrIz_1)this.id_class[id_protected[10]];
      var2.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrAD var1) {
      this.id_implements();
      Ml_1 var2 = var1.id_break();
      rJY var3 = var1.id_case();
      if (var3.id_break()) {
         int var4 = var1.id_byte();
         int var5 = var1.id_throws();
         int var6 = var1.id_protected();
         int var7 = var1.id_class();

         for (rrpQ_2 var9 : (List)this.id_class[id_protected[20]]) {
            rrNt_1 var10 = var9.id_byte();
            if (var3.equals(var10.id_throws())) {
               int var11 = Color.WHITE.getRGB();
               if (var9.id_break()) {
                  var11 = ((rrIz_1)this.id_class[id_protected[21]]).id_byte();
               } else if (var9.id_class()) {
                  var11 = ((rrIz_1)this.id_class[id_protected[22]]).id_byte();
               } else if (var9.id_protected()) {
                  var11 = ((rrIz_1)this.id_class[id_protected[23]]).id_byte();
               }

               rrfD_2.id_protected(var2, (float)var4, (float)var5, (float)var6, (float)var7, var11);
            }
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-73, -42, 101, -109, -104, 56, -30, 50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 392205082;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4717497231749322278L;
   }

   private <T> Comparator<T> id_class(Function<T, rrNt_1> var1) {
      return Comparator.comparingDouble(var1x -> {
         rrNt_1 var2 = (rrNt_1)var1.apply((T)var1x);
         double var3 = (double)Math.max(id_case[7], var2.id_case());
         double var5 = (double)Math.max(id_case[8], var2.id_throws().id_class().id_char());
         return var3 / var5;
      });
   }

   @EventTarget
   public void id_class(rrAT var1) {
      this.id_implements();
      if (var1.id_class() instanceof rXe_1) {
         if (((rrIk_1)this.id_class[id_protected[11]]).id_class()) {
            if (!((List)this.id_class[id_protected[12]]).isEmpty()) {
               ((List)this.id_class[id_protected[13]]).clear();
            }

            rrNW var2 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_protected[14]]).id_throws();
            long var3 = C_throws.id_byte().id_native().id_byte();
            if (!var2.id_case() && var2.id_byte(var2.id_switch())) {
               List var5 = var2.id_int();
               List var6 = var2.id_synchronized();
               if (!var5.isEmpty() && !var6.isEmpty()) {
                  ArrayList var7 = new ArrayList();
                  boolean var8 = ((rrIk_1)this.id_class[id_protected[15]]).id_class();

                  for (rJY var10 : var5) {
                     rrNt_1 var11 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_protected[16]]).id_break(var10);
                     if (var11 != null) {
                        String var12 = var11.id_catch();
                        int var13 = var11.id_case();
                        if (var13 != id_byte[4] && var12 != null && !var12.equals(id_import.id_while().id_byte()) && (var8 || var3 >= (long)var13)) {
                           var7.add(var11);
                        }
                     }
                  }

                  if (!var7.isEmpty()) {
                     ArrayList var18 = new ArrayList();

                     for (rrNt_1 var21 : var7) {
                        var21.id_class(var21.id_throws().id_class());
                        var21.id_class(var6);
                        var21.id_break(var5);
                        var18.add(var21);
                     }

                     Comparator var20 = this.id_extends();
                     Comparator var22 = this.id_throws();
                     rrNt_1 var23 = (rrNt_1)var18.stream().min(var20).orElse(null);
                     ArrayList var24 = new ArrayList();

                     for (rrNt_1 var15 : var18) {
                        if (var23 != null && var15.equals(var23)) {
                           ((List)this.id_class[id_protected[17]]).add(new rrpQ_2(var15).id_byte(id_case[4]));
                        } else {
                           for (rrNd_1 var17 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_protected[18]]).id_protected()) {
                              if (var17.id_while() && var17.id_class(var15, var1x -> var1x instanceof rrcj_3 && var8 ? id_case[9] : id_case[10])) {
                                 var24.add(new rrpQ_2(var15).id_class(id_case[5]));
                                 break;
                              }
                           }
                        }
                     }

                     rrpQ_2 var25 = (rrpQ_2)var24.stream().min(var22).orElse(null);

                     for (rrpQ_2 var27 : var24) {
                        if (var25 != null && var27.equals(var25)) {
                           var27.id_break(id_case[6]);
                        }

                        ((List)this.id_class[id_protected[19]]).add(var27);
                     }
                  }
               }
            }
         }
      }
   }

   private static void id_break() {
      id_break = new String[]{
         new String("Выделять предметы на\nаукционе"),
         new String("Выделять если\nнедостаточно денег для\nпокупки"),
         new String("Цвет самого дешёвого\nпредмета"),
         new String("Цвет предмета который\nкупит автобай"),
         new String("Цвет самого дешёвого\nпредмета который купит\nавтобай")
      };
   }

   private Comparator<rrpQ_2> id_throws() {
      return this.id_class(rrpQ_2::id_byte);
   }

   private static void id_finally() {
      id_byte = new byte[]{5, 2, 3, 4, -1, 6};
   }

   private Comparator<rrNt_1> id_extends() {
      return this.id_class(Function.identity());
   }

   private static void id_case() {
      id_protected = new short[]{0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 3, 5, 4, 0, 1, 1, 1, 1};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
      }
   }

   @Override
   public boolean aK_() {
      this.id_implements();
      ((List)this.id_class[id_protected[24]]).clear();
      return super.aK_();
   }
}

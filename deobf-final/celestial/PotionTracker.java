package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PotionTracker extends Module {
   private static double[] protected_;
   public static Object[] break_;
   public Object[] byte_;
   private static String[] throws_;
   private static short[] catch_;
   private static boolean[] private_;

   public PotionTracker() {
      super("Potion Tracker", "Отслеживает накладываемые\nзелья на игроков", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.continue_();
      HashMap var5 = new HashMap();
      this.byte_[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      private_ = new boolean[]{false, true, true, false, true, false, false, true, true};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7161519593042032061L;
   }

   @EventTarget
   public void class_(rrnM_2 var1) {
      this.continue_();
      if (!((Map)this.byte_[0]).isEmpty()) {
         cG_2 var2 = var1.class_();
         List var3 = (List)((Map)this.byte_[0]).get(var2.sv().getId());
         if (var3 != null && !var3.isEmpty()) {
            for (rLY var5 : var3) {
               var2.break_(var5);
            }
         }
      }
   }

   @EventTarget
   public void class_(rrLI var1) {
      this.continue_();
      if (!((Map)this.byte_[0]).isEmpty()) {
         iB_2 var2 = var1.byte_();
         rLY var3 = var1.break_();
         if (var2 instanceof cM_2 var4) {
            List var5 = (List)((Map)this.byte_[0]).get(var4.sv().getId());
            if (var5 == null || var5.isEmpty()) {
               return;
            }

            for (rLY var7 : var5) {
               if (var7.class_().equals(var3.class_())) {
                  var5.remove(var7);
                  var5.add(var3);
                  break;
               }
            }
         }
      }
   }

   @EventTarget
   public void class_(rrLC var1) {
      this.continue_();
      rLY var2 = var1.break_();
      if (var1.class_() instanceof cM_2 var4) {
         List var5 = ((Map)this.byte_[0]).computeIfAbsent(var4.sv().getId(), var0 -> new ArrayList());
         if (var5.stream().noneMatch(var1x -> var1x.class_() == var2.class_() ? true : private_[3])) {
            var5.add(var2);
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1072760093;
   }

   @EventTarget
   public void class_(rrLo_1 var1) {
      this.continue_();
      if (!((Map)this.byte_[0]).isEmpty()) {
         iB_2 var2 = var1.break_();
         rLY var3 = var1.class_();
         if (var2 instanceof cM_2 var4) {
            List var5 = (List)((Map)this.byte_[0]).get(var4.sv().getId());
            if (var5 == null || var5.isEmpty()) {
               return;
            }

            var5.remove(var3);
         }
      }
   }

   @EventTarget
   public void class_(j_1 var1) {
      this.continue_();
      if (!((Map)this.byte_[0]).isEmpty()) {
         for (Entry var3 : ((Map)this.byte_[0]).entrySet()) {
            UUID var4 = (UUID)var3.getKey();
            List var5 = (List)var3.getValue();
            var5.removeIf(var1x -> {
               if (var1x.break_() > 0) {
                  if ((gm_3)import_.class_[56] != null && ((gm_3)import_.class_[56]).class_(var4) == null) {
                     var1x.catch_();
                  }

                  return private_[5];
               } else {
                  return private_[4];
               }
            });
         }

         ((Map)this.byte_[0]).entrySet().removeIf(var0 -> ((List)var0.getValue()).isEmpty());
      }
   }

   @EventTarget
   public void class_(rrLD var1) {
      List var2 = var1.protected_();
      iB_2 var3 = var1.break_();
      rdn_3 var4 = var1.byte_();
      double var5 = var1.class_();
      if (!var2.isEmpty()) {
         var2.sort((rrHD)break_[0]);
         if (var3 instanceof cG_2 var7) {
            if (!var7.sc() && var7.Pu()) {
               int var8 = var2.size();
               rgN_2 var9 = new rgN_2("");
               rgN_2 var10 = new rgN_2("\n");
               double var11 = 0.0;
               double var13 = 0.0;

               for (int var15 = 0; var15 < var8; var15++) {
                  rLY var16 = (rLY)var2.get(var15);
                  int var17 = var16.break_();
                  var11 += (double)((int)(var5 * (double)var17 + 0.5));
                  var13 += (double)var17;
                  if (var17 > 0) {
                     var10.break_(rgF_2.GRAY + " • ").break_(rgF_2.RED + rAB.class_(var16, rgF_2.GRAY));
                     if (var15 != var8 - 1) {
                        var10.break_("\n");
                     }
                  }
               }

               var9.class_(rgF_2.GRAY);
               if (var7 == (cb_3)import_.class_[57]) {
                  var9.break_("Вы получили ");
               } else {
                  var9.class_(rrjZ_2.byte_((an_3)var7)).break_(" получил ");
               }

               double var19 = var11 / var13;
               String var20 = (int)(var19 * 100.0) + "%";
               rVa_1 var18;
               if (var19 >= 0.7) {
                  var18 = new rVa_1(Color.GREEN.getRGB());
               } else if (var19 >= 0.4) {
                  var18 = new rVa_1(Color.YELLOW.getRGB());
               } else {
                  var18 = new rVa_1(Color.RED.getRGB());
               }

               var9.class_(var4.continue_())
                  .break_("\n" + rgF_2.GRAY + " • Успешность: ")
                  .class_(rrfu_3.class_().class_(var20).class_(var18).break_())
                  .class_(var10);
               rrfu_3.class_((rVi_1)var9);
            }
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 18, 80, 101, -45, -124, -6, 30}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.continue_();
      super.throws_(var1);
      ((Map)this.byte_[0]).clear();
   }

   private void continue_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
      }
   }

   private static void else_() {
      throws_ = new String[]{
         new String("Potion Tracker"),
         new String("Отслеживает накладываемые\nзелья на игроков"),
         new String(""),
         new String("\n"),
         new String("\n"),
         new String("Вы получили "),
         new String(" получил ")
      };
   }

   private static void new_() {
      Object[] var0 = new Object[]{new rrHD()};
      break_ = var0;
   }

   private static void return_() {
      protected_ = new double[]{0.0, 0.0, 0.5, 100.0, 0.7, 0.4};
   }

   private static void super_() {
      catch_ = new short[]{4, 0, 0, 57, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 56, 56};
   }
}

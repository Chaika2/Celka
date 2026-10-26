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
   private static double[] id_protected;
   public static Object[] id_break;
   public Object[] id_byte;
   private static String[] id_throws;
   private static short[] id_catch;
   private static boolean[] id_private;

   public PotionTracker() {
      super("Potion Tracker", "Отслеживает накладываемые\nзелья на игроков", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_continue();
      HashMap var5 = new HashMap();
      this.id_byte[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_private = new boolean[]{false, true, true, false, true, false, false, true, true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7161519593042032061L;
   }

   @EventTarget
   public void id_class(rrnM_2 var1) {
      this.id_continue();
      if (!((Map)this.id_byte[0]).isEmpty()) {
         cG_2 var2 = var1.id_class();
         List var3 = (List)((Map)this.id_byte[0]).get(var2.sv().getId());
         if (var3 != null && !var3.isEmpty()) {
            for (rLY var5 : var3) {
               var2.id_break(var5);
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrLI var1) {
      this.id_continue();
      if (!((Map)this.id_byte[0]).isEmpty()) {
         iB_2 var2 = var1.id_byte();
         rLY var3 = var1.id_break();
         if (var2 instanceof cM_2 var4) {
            List var5 = (List)((Map)this.id_byte[0]).get(var4.sv().getId());
            if (var5 == null || var5.isEmpty()) {
               return;
            }

            for (rLY var7 : var5) {
               if (var7.id_class().equals(var3.id_class())) {
                  var5.remove(var7);
                  var5.add(var3);
                  break;
               }
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrLC var1) {
      this.id_continue();
      rLY var2 = var1.id_break();
      if (var1.id_class() instanceof cM_2 var4) {
         List var5 = ((Map)this.id_byte[0]).computeIfAbsent(var4.sv().getId(), var0 -> new ArrayList());
         if (var5.stream().noneMatch(var1x -> var1x.id_class() == var2.id_class() ? true : id_private[3])) {
            var5.add(var2);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1072760093;
   }

   @EventTarget
   public void id_class(rrLo_1 var1) {
      this.id_continue();
      if (!((Map)this.id_byte[0]).isEmpty()) {
         iB_2 var2 = var1.id_break();
         rLY var3 = var1.id_class();
         if (var2 instanceof cM_2 var4) {
            List var5 = (List)((Map)this.id_byte[0]).get(var4.sv().getId());
            if (var5 == null || var5.isEmpty()) {
               return;
            }

            var5.remove(var3);
         }
      }
   }

   @EventTarget
   public void id_class(j_1 var1) {
      this.id_continue();
      if (!((Map)this.id_byte[0]).isEmpty()) {
         for (Entry var3 : ((Map)this.id_byte[0]).entrySet()) {
            UUID var4 = (UUID)var3.getKey();
            List var5 = (List)var3.getValue();
            var5.removeIf(var1x -> {
               if (var1x.id_break() > 0) {
                  if ((gm_3)id_import.id_class[56] != null && ((gm_3)id_import.id_class[56]).id_class(var4) == null) {
                     var1x.id_catch();
                  }

                  return id_private[5];
               } else {
                  return id_private[4];
               }
            });
         }

         ((Map)this.id_byte[0]).entrySet().removeIf(var0 -> ((List)var0.getValue()).isEmpty());
      }
   }

   @EventTarget
   public void id_class(rrLD var1) {
      List var2 = var1.id_protected();
      iB_2 var3 = var1.id_break();
      rdn_3 var4 = var1.id_byte();
      double var5 = var1.id_class();
      if (!var2.isEmpty()) {
         var2.sort((rrHD)id_break[0]);
         if (var3 instanceof cG_2 var7) {
            if (!var7.sc() && var7.Pu()) {
               int var8 = var2.size();
               rgN_2 var9 = new rgN_2("");
               rgN_2 var10 = new rgN_2("\n");
               double var11 = 0.0;
               double var13 = 0.0;

               for (int var15 = 0; var15 < var8; var15++) {
                  rLY var16 = (rLY)var2.get(var15);
                  int var17 = var16.id_break();
                  var11 += (double)((int)(var5 * (double)var17 + 0.5));
                  var13 += (double)var17;
                  if (var17 > 0) {
                     var10.id_break(rgF_2.GRAY + " • ").id_break(rgF_2.RED + rAB.id_class(var16, rgF_2.GRAY));
                     if (var15 != var8 - 1) {
                        var10.id_break("\n");
                     }
                  }
               }

               var9.id_class(rgF_2.GRAY);
               if (var7 == (cb_3)id_import.id_class[57]) {
                  var9.id_break("Вы получили ");
               } else {
                  var9.id_class(rrjZ_2.id_byte((an_3)var7)).id_break(" получил ");
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

               var9.id_class(var4.id_continue())
                  .id_break("\n" + rgF_2.GRAY + " • Успешность: ")
                  .id_class(rrfu_3.id_class().id_class(var20).id_class(var18).id_break())
                  .id_class(var10);
               rrfu_3.id_class((rVi_1)var9);
            }
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 18, 80, 101, -45, -124, -6, 30}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_continue();
      super.id_throws(var1);
      ((Map)this.id_byte[0]).clear();
   }

   private void id_continue() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
      }
   }

   private static void id_else() {
      id_throws = new String[]{
         new String("Potion Tracker"),
         new String("Отслеживает накладываемые\nзелья на игроков"),
         new String(""),
         new String("\n"),
         new String("\n"),
         new String("Вы получили "),
         new String(" получил ")
      };
   }

   private static void id_new() {
      Object[] var0 = new Object[]{new rrHD()};
      id_break = var0;
   }

   private static void id_return() {
      id_protected = new double[]{0.0, 0.0, 0.5, 100.0, 0.7, 0.4};
   }

   private static void id_super() {
      id_catch = new short[]{4, 0, 0, 57, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 56, 56};
   }
}

package celestial;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.RandomStringUtils;

public class FtHelper extends Module {
   private static byte[] id_protected;
   public static Object[] id_break;
   public Object[] id_byte;
   private static long[] id_throws;
   private static short[] id_catch;
   private static double[] id_private;
   private static boolean[] id_implements;
   private static String[] id_finally;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{28, -81, -6, -68, 91, 50, -111, 45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public FtHelper() {
      super(id_finally[0], id_finally[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_catch[0]]);
      this.id_this();
      ArrayList var9 = new ArrayList();
      this.id_byte[id_catch[1]] = var9;
      rrIk_1 var10 = new rrIk_1(id_finally[2], id_implements[0]);
      this.id_byte[id_catch[2]] = var10;
      rrIk_1 var11 = new rrIk_1(id_finally[3], id_implements[1]);
      this.id_byte[id_catch[3]] = var11;
      rrIk_1 var12 = new rrIk_1(id_finally[4], id_implements[2]);
      this.id_byte[id_catch[4]] = var12;
      rrIk_1 var13 = new rrIk_1(id_finally[5], id_implements[3]);
      this.id_byte[id_catch[5]] = var13;
      rrIk_1 var14 = new rrIk_1(id_finally[6], id_implements[4]);
      this.id_byte[id_catch[6]] = var14;
      rrIk_1 var15 = new rrIk_1(id_finally[7], id_implements[5]);
      this.id_byte[id_catch[7]] = var15;
      rrIk_1 var16 = new rrIk_1(id_finally[8], id_implements[6]);
      this.id_byte[id_catch[8]] = var16;
      rrIk_1 var17 = new rrIk_1(id_finally[9], id_implements[7]);
      this.id_byte[id_catch[9]] = var17;
      rrfP_2 var18 = new rrfP_2();
      this.id_byte[id_catch[10]] = var18;
      Integer var19 = Integer.valueOf(id_protected[0]);
      this.id_byte[id_catch[11]] = var19;
      rrfw_3 var20 = new rrfw_3();
      this.id_byte[id_catch[12]] = var20;
      String var10002 = id_finally[10];
      Setting[] var10003 = new Setting[id_implements[8]];
      var10003[id_implements[9]] = (rrIk_1)this.id_byte[id_catch[13]];
      GroupSetting var1 = new GroupSetting(var10002, var10003);
      GroupSetting var2 = new GroupSetting(id_finally[11]);
      GroupSetting var3 = new GroupSetting(id_finally[12]);
      GroupSetting var4 = new GroupSetting(id_finally[13]);
      rryR var21 = this.id_class(new rryR(this));
      this.id_byte[id_catch[14]] = var21;
      rryf_1 var22 = this.id_class(new rryf_1(this));
      this.id_byte[id_catch[15]] = var22;
      rrpk_3 var23 = this.id_class(new rrpk_3(this));
      this.id_byte[id_catch[16]] = var23;
      rryo_1 var24 = this.id_class(new rryo_1(this));
      this.id_byte[id_catch[17]] = var24;
      rrpx_3 var25 = this.id_class(new rrpx_3(this));
      this.id_byte[id_catch[18]] = var25;
      rrph_3 var26 = this.id_class(new rrph_3(this));
      this.id_byte[id_catch[19]] = var26;
      rryU var27 = this.id_class(new rryU(this));
      this.id_byte[id_catch[20]] = var27;
      rrpB_2 var28 = this.id_class(new rrpB_2(this));
      this.id_byte[id_catch[21]] = var28;
      rrps_3 var29 = this.id_class(new rrps_3(this));
      this.id_byte[id_catch[22]] = var29;
      rryw_1 var30 = this.id_class(new rryw_1(this));
      this.id_byte[id_catch[23]] = var30;
      rrpG_2 var31 = this.id_class(new rrpG_2(this));
      this.id_byte[id_catch[24]] = var31;
      rrpr_3 var32 = this.id_class(new rrpr_3(this));
      this.id_byte[id_catch[25]] = var32;
      rrya_1 var33 = this.id_class(new rrya_1(this));
      this.id_byte[id_catch[26]] = var33;
      rrpM_2 var34 = this.id_class(new rrpM_2(this));
      this.id_byte[id_catch[27]] = var34;
      rryV var35 = this.id_class(new rryV(this));
      this.id_byte[id_catch[28]] = var35;
      rrpz_3 var36 = this.id_class(new rrpz_3(this, var2));
      this.id_byte[id_catch[29]] = var36;
      rrpF_2 var37 = this.id_class(new rrpF_2(this));
      this.id_byte[id_catch[30]] = var37;
      rrpc_3 var38 = this.id_class(new rrpc_3(this, var3));
      this.id_byte[id_catch[31]] = var38;
      rrpN_2 var39 = this.id_class(new rrpN_2(this));
      this.id_byte[id_catch[32]] = var39;
      rrpL_2 var40 = this.id_class(new rrpL_2(this));
      this.id_byte[id_catch[33]] = var40;
      rrpm_3 var41 = this.id_class(new rrpm_3(this, var4));
      this.id_byte[id_catch[34]] = var41;
      Setting[] var10001 = new Setting[id_protected[1]];
      var10001[id_implements[13]] = (rrIk_1)this.id_byte[id_catch[35]];
      var10001[id_implements[14]] = (rrIk_1)this.id_byte[id_catch[36]];
      var10001[id_protected[2]] = (rrIk_1)this.id_byte[id_catch[37]];
      var10001[id_protected[3]] = (rrIk_1)this.id_byte[id_catch[38]];
      var10001[id_protected[4]] = (rrIk_1)this.id_byte[id_catch[39]];
      var3.id_class(var10001);
      var10001 = new Setting[id_protected[5]];
      var10001[id_implements[15]] = (rrIk_1)this.id_byte[id_catch[40]];
      var10001[id_implements[16]] = (rrIk_1)this.id_byte[id_catch[41]];
      var2.id_class(var10001);
      var10001 = new Setting[id_protected[6]];
      var10001[id_implements[17]] = var2;
      var10001[id_implements[18]] = var4;
      var10001[id_protected[7]] = var1;
      var10001[id_protected[8]] = var3;
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_byte == null) {
         this.id_byte = new Object[37];
         this.id_byte[32] = false;
         this.id_byte[33] = 0;
         this.id_byte[34] = 0L;
         this.id_byte[35] = 0L;
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_this();
      ((rrfP_2)this.id_byte[id_catch[139]]).id_class(var1);
   }

   @EventTarget
   public void id_class(rrLE var1) {
      if (this.id_new()) {
         cW_2 var2 = var1.id_class();
         Lu_1 var3 = var2.id_byte();
         vm_3 var5 = (vm_3)id_import.id_class[id_catch[47]];
         if (var5 instanceof FP var4 && var4.id_class == var3) {
            String var12 = var3.id_private();
            Matcher var6 = ((Pattern)rrjb_3.id_class[id_catch[48]]).matcher(var12);
            Matcher var7 = ((Pattern)rrjb_3.id_class[id_catch[49]]).matcher(var12);
            Matcher var8 = ((Pattern)rrjb_3.id_class[id_catch[50]]).matcher(var12);
            Matcher var9 = ((Pattern)rrjb_3.id_class[id_catch[51]]).matcher(var12);
            String var10 = null;
            String var11 = null;
            if (var6.find()) {
               var10 = this.id_class((rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[id_catch[52]], var6.group(id_protected[12]));
               var11 = id_finally[15];
            } else if (var7.find()) {
               var10 = this.id_class(this.id_break(var7.group(id_implements[20])), var7.group(id_protected[13]));
               var11 = id_finally[16];
            } else if (var8.find()) {
               var10 = this.id_class((rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[id_catch[53]], var8.group(id_protected[14]));
               var11 = id_finally[17];
            } else if (var9.find()) {
               var10 = this.id_class((rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[id_catch[54]], var9.group(id_implements[21]));
               var11 = id_finally[18];
            }

            if (var10 != null && var11 != null) {
               this.id_class(var11, var10, var2);
               var1.id_class(id_implements[22]);
            }
         }
      }
   }

   private String id_class(rryT var1, String var2) {
      this.id_this();

      try {
         if (var1 == (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[id_catch[154]]
            || var1 == (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[id_catch[155]]) {
            String var3 = this.id_protected(var2);
            if (var3 != null) {
               var2 = String.valueOf(C_throws.id_byte().id_native().id_byte());
            }
         }

         return ((rrpF_2)this.id_byte[id_catch[156]]).id_class(var2);
      } catch (Exception var4) {
         return null;
      }
   }

   private void id_class(String var1, String var2, cW_2 var3) {
      if (var2 != null && !var2.isEmpty()) {
         try {
            List var4 = var3.id_throws();
            cz_3 var5 = new cz_3(new rgN_2(var1 + ": " + rgF_2.YELLOW + rql_3.id_class(var2, (char)id_protected[36])).id_catch());
            var4.add(id_implements[49], var5);
         } catch (NumberFormatException var6) {
         }
      }
   }

   @EventTarget
   public void id_class(rrAv_1 var1) {
      this.id_this();
      String var2 = var1.id_class();
      boolean var3 = this.id_new();
      boolean var4 = ((rrIk_1)this.id_byte[id_catch[89]]).id_class();
      if (var3 || var4) {
         String var5 = id_import.id_while().id_byte();
         rryt_1 var6 = null;
         Matcher var7 = ((Pattern)rrjb_3.id_class[id_catch[90]]).matcher(var2);
         if (var3) {
            Matcher var8 = ((Pattern)rrjb_3.id_class[id_catch[91]]).matcher(var2);
            Matcher var9 = ((Pattern)rrjb_3.id_class[id_catch[92]]).matcher(var2);
            Matcher var10 = ((Pattern)rrjb_3.id_class[id_catch[93]]).matcher(var2);
            Matcher var11 = ((Pattern)rrjb_3.id_class[id_catch[94]]).matcher(var2);
            if (var8.find() && this.id_catch(var8.group(id_implements[33])) != null) {
               var1.id_byte("/ah " + var5);
            } else if (var11.find() && this.id_catch(var11.group(id_implements[34])) != null) {
               var1.id_byte("/duel stats " + var5);
            } else if (var9.find() && this.id_protected(var9.group(id_protected[17])) != null) {
               var6 = new rryt_1("/pay " + var9.group(id_protected[18]), (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[id_catch[95]]);
            } else if (var10.find() && rql_3.id_break(var10.group(id_implements[35]))) {
               var1.id_byte(this.id_goto());
               Boolean var16 = id_implements[36];
               this.id_byte[id_catch[96]] = var16;
            }
         }

         if (var7.find() && this.id_protected(var7.group(id_protected[19])) != null) {
            String var18 = var7.group(id_implements[37]);
            rryT var20 = this.id_break(var18);
            if (var20 != null) {
               var6 = new rryt_1("/clan " + var18, var20);
            }
         }

         if (var6 != null) {
            this.id_byte[id_catch[97]] = var6;
            rryT var19 = var6.id_break();
            var1.id_byte(var19 == (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[id_catch[98]] ? id_finally[28] : id_finally[29]);
         }
      }
   }

   @EventTarget
   public void id_class(rrLD var1) {
      this.id_this();
      List var2 = var1.id_protected();
      iB_2 var3 = var1.id_break();
      if (((rrIk_1)this.id_byte[id_catch[99]]).id_class() && var3 == (cb_3)id_import.id_class[id_catch[100]]) {
         ArrayList var4 = new ArrayList();

         for (rLY var6 : var2) {
            var4.add(var6.id_class());
         }

         rrfO_2 var9 = rrfO_2.id_class(var4);
         rVi_1 var10 = null;
         if (var9 == (rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[id_catch[101]]) {
            var10 = new rgN_2(id_finally[30]).id_class(rgF_2.GREEN);
         } else if (var9 == (rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[id_catch[102]]) {
            var10 = new rgN_2(id_finally[31]).id_class(rgF_2.BLUE);
         }

         if (var10 != null) {
            int var7 = ((rryU)this.id_byte[id_catch[103]]).id_break();
            int var8 = rrfY_2.id_class(rdy_3.hi, id_implements[38], id_implements[39]);
            if (var7 != id_protected[20]) {
               this.id_class(new rgN_2(id_finally[32]).id_class(var10).id_break(id_finally[33]));
            } else if (var8 != id_protected[21]) {
               this.id_class(new rgN_2(id_finally[34]).id_class(var10).id_break(id_finally[35]));
            } else {
               this.id_class(new rgN_2(id_finally[36]).id_class(var10));
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrAZ var1) {
      this.id_this();
      if (((rrIk_1)this.id_byte[id_catch[42]]).id_class() && var1.id_class() instanceof Fc_1 var2) {
         String var11 = var2.id_new().id_byte();
         int var4 = ((rJr_1)((cb_3)id_import.id_class[id_catch[43]]).id_implements[id_catch[44]]).id_case;
         if (!var11.startsWith(id_finally[14])) {
            return;
         }

         rrNW var5 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_catch[45]]).id_throws();
         Pj_1 var6 = C_throws.id_byte().id_package();
         int var7 = var2.id_throw();
         if (var6.id_byte()) {
            if (var5.id_int().isEmpty()) {
               var5.id_break(id_throws[0]);
               var5.id_protected(id_implements[19]);
            } else if (var7 > 0 && var7 % id_protected[9] == 0) {
               rqs_3 var8 = var2.G_().id_extends();
               rdn_3 var9 = var6.id_break(var8);
               int var10 = var8.indexOf(var9);
               if (var10 != id_protected[10]) {
                  ((Ax_1)id_import.id_class[id_catch[46]]).id_class(var4, var10, id_protected[11], rXa_1.CLONE);
               }
            }
         }
      }
   }

   private void id_class(rVi_1 var1) {
      rrfu_3.id_class(rrfu_3.id_break((Module)this).id_class(rgF_2.GRAY).id_class(var1));
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[152]]).id_class(new rrtd_3(this.id_case(), var1, id_catch[153]));
   }

   @EventTarget
   public void id_class(rrLO var1) {
      this.id_this();
      if ((
            (rrfq_3)rrfp_3.id_class[id_catch[82]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[83]]
               || (rrfq_3)rrfp_3.id_class[id_catch[84]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[85]]
         )
         && var1.id_break() == null) {
         String var2 = var1.id_protected();
         if (((rrIk_1)this.id_byte[id_catch[86]]).id_class()) {
            Matcher var3 = ((Pattern)rrjb_3.id_class[id_catch[87]]).matcher(var2);
            if (var3.find()) {
               List var4 = rrfp_3.id_case();
               if (var4.isEmpty()) {
                  return;
               }

               String var5 = rrfu_3.id_class((Module)this);
               String var6 = var3.group(id_implements[32]);

               for (rrZk_1 var8 : var4) {
                  String var9 = var8.id_class();
                  ((cb_3)id_import.id_class[id_catch[88]]).id_case("/ps add " + var9 + " " + var6);
                  rrfu_3.id_byte(var5 + "Добавляем '" + var9 + "' в регион #" + var6);
               }
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrLZ var1) {
      this.id_this();
      if (var1.id_class() instanceof rmt_3 var2
         && (
            (rrfq_3)rrfp_3.id_class[id_catch[55]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[56]]
               || (rrfq_3)rrfp_3.id_class[id_catch[57]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[58]]
         )
         && ((rrIk_1)this.id_byte[id_catch[59]]).id_class()
         && (cb_3)id_import.id_class[id_catch[60]] != null
         && (rJr_1)((cb_3)id_import.id_class[id_catch[61]]).id_implements[id_catch[62]] instanceof rJV
         && var2.id_protected() == id_implements[23]
         && var2.id_case().id_break() instanceof rxJ_2 var5
         && var5.id_catch() instanceof Wp_1) {
         var2.id_break(var2.id_byte() - id_protected[15]);
         var2.id_class(id_implements[24]);
         ((cb_3)id_import.id_class[id_catch[63]]).id_strictfp();
      }
   }

   @EventTarget
   public void id_class(rrLh_1 var1) {
      this.id_this();
      boolean var2 = this.id_new();
      boolean var3 = ((rrIk_1)this.id_byte[id_catch[64]]).id_class();
      if (var2 || var3) {
         rgP_2 var4 = var1.id_throws();
         String var5 = var1.id_class();
         if ((
               (rrfq_3)rrfp_3.id_class[id_catch[65]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[66]]
                  || (rrfq_3)rrfp_3.id_class[id_catch[67]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[68]]
            )
            && var1.id_protected() == null) {
            if (var2) {
               if (var4 instanceof rgN_2 var6) {
                  if (!var5.contains(id_finally[19]) && !var5.contains(id_finally[20])) {
                     Matcher var17 = ((Pattern)rrjb_3.id_class[id_catch[70]]).matcher(var5);
                     if (var17.find()) {
                        String var19 = var17.group(id_implements[28]);
                        var1.id_class(var6.id_class(var19, rql_3.id_class(var19, (char)id_protected[16]), id_implements[29]));
                     }
                  } else {
                     Matcher var7 = ((Pattern)rrjb_3.id_class[id_catch[69]]).matcher(var5);
                     if (var7.find()) {
                        String var8 = var7.group(id_implements[25]);
                        Duration var9 = Duration.ofSeconds(Long.parseLong(var8.replaceAll(id_finally[21], id_finally[22])));
                        var1.id_class(var6.id_class(var8, rql_3.id_class(var9), id_implements[27]));
                     }
                  }
               }

               if ((Boolean)this.id_byte[id_catch[71]] && var5.contains(id_finally[23])) {
                  ((cb_3)id_import.id_class[id_catch[72]]).id_case(this.id_goto());
               } else if (var5.contains(id_finally[24]) || var5.contains(id_finally[25])) {
                  Boolean var14 = id_implements[30];
                  this.id_byte[id_catch[73]] = var14;
               }
            }

            if ((rryt_1)this.id_byte[id_catch[74]] != null) {
               Matcher var16 = null;
               if (((rryt_1)this.id_byte[id_catch[75]]).id_break() == (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[id_catch[76]]) {
                  if (var2) {
                     var16 = ((Pattern)rrjb_3.id_class[id_catch[77]]).matcher(var5);
                  }
               } else {
                  var16 = ((Pattern)rrjb_3.id_class[id_catch[78]]).matcher(var5);
               }

               if (var16 != null && var16.find()) {
                  long var18 = Long.parseLong(var16.group(id_implements[31]).replaceAll(id_finally[26], id_finally[27]));
                  ((cb_3)id_import.id_class[id_catch[79]]).id_case(((rryt_1)this.id_byte[id_catch[80]]).id_class() + " " + var18);
                  Object var15 = null;
                  this.id_byte[id_catch[81]] = var15;
               }
            }
         }
      }
   }

   public <T extends rrTF<?>> T id_class(T var1) {
      this.id_this();
      ((List)this.id_byte[id_catch[161]]).add(var1);
      if (var1 instanceof rrHv_1 var2) {
         ((rrTm_1)rrTm_1.staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[id_catch[162]]).id_class(var2);
      }

      return (T)var1;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1520658337;
   }

   @EventTarget
   public void id_class(rrAq_1 var1) {
      this.id_this();
      rJY var2 = var1.id_class();
      rJr_1 var3 = var1.id_break();
      if (var3 instanceof rXe_1 && ((rrIk_1)this.id_byte[id_catch[104]]).id_class()) {
         if ((rrfq_3)rrfp_3.id_class[id_catch[105]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[106]]
            && (rrfq_3)rrfp_3.id_class[id_catch[107]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[108]]) {
            return;
         }

         rdn_3 var4 = var2.id_class();
         int var5 = var4.id_char();
         if (var2.id_protected > id_protected[22] || var5 < id_protected[23]) {
            return;
         }

         rrNt_1 var6 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_catch[109]]).id_break(var2);
         if (var6 == null) {
            return;
         }

         List var7 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_catch[110]]).id_throws().id_synchronized();
         var6.id_class(var7);
         rcd_3 var8 = var4.id_package();
         int var9 = var6.id_case();
         if (var8 != null && var8.id_byte(id_finally[37], id_protected[24])) {
            rcd_3 var10 = var8.id_int(id_finally[38]);
            if (var10.id_protected(id_finally[39]) == id_protected[25]) {
               try {
                  rcy_3 var11 = var10.id_protected(id_finally[40], id_protected[26]);
                  int var12 = id_protected[27];

                  for (int var13 = id_implements[40]; var13 < var11.size(); var13++) {
                     String var14 = var11.id_implements(var13);
                     if (var14.contains(id_finally[41]) || var14.contains(id_finally[42])) {
                        var12 = var13;
                        break;
                     }
                  }

                  if (var12 != id_protected[28]) {
                     String var16 = rgF_2.GREEN + "$ " + rgF_2.WHITE + "Цена за штуку: " + rgF_2.GREEN + rql_3.id_class(var9 / var5, (char)id_protected[29]);
                     var11.id_byte(var12 + id_implements[41], rca_3.id_class("{\"text\":\"" + var16 + "\"}"));
                  }
               } catch (Exception var15) {
                  var15.printStackTrace();
               }
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrAR var1) {
      this.id_this();
      rdn_3 var2 = var1.id_class();
      rpm_3 var3 = var1.id_throws();
      xd_3 var4 = var1.id_protected();
      rff_3 var5 = var1.id_break();
      rfH_2 var6 = var5.id_class();
      rpr_3 var7 = var5.id_break();
      if (var3 == rpm_3.MAIN_HAND
         && (
            (rrfq_3)rrfp_3.id_class[id_catch[111]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[112]]
               || (rrfq_3)rrfp_3.id_class[id_catch[113]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[114]]
         )
         && var2.id_break() instanceof rkx_3
         && rrjS_2.id_class(var2, var4, var6, var7)) {
         int var8 = ((rhz_3)((cb_3)id_import.id_class[id_catch[115]]).id_implements[id_catch[116]]).id_throws();
         if (var8 != id_protected[30]) {
            if (var8 >= id_protected[31]) {
               ((rrfP_2)this.id_byte[id_catch[117]]).id_class(((rhz_3)((cb_3)id_import.id_class[id_catch[118]]).id_implements[id_catch[119]]).id_protected);
               Integer var14 = var8;
               this.id_byte[id_catch[120]] = var14;
               ((Ax_1)id_import.id_class[id_catch[121]]).id_class(var8);
               Long var15 = rqR_2.id_break();
               this.id_byte[id_catch[122]] = var15;
            } else {
               Integer var16 = ((rhz_3)((cb_3)id_import.id_class[id_catch[123]]).id_implements[id_catch[124]]).id_protected;
               this.id_byte[id_catch[125]] = var16;
               rrfo_3.id_class(var8);
            }

            ((Aq_1)((cb_3)id_import.id_class[id_catch[126]]).id_break[id_catch[127]]).id_break(new rZx_1(var3, var5));
            var1.id_class(id_implements[42]);
         } else {
            rrfu_3.id_byte(rrfu_3.id_class((Module)this) + "Нет свободного слота в инвентаре чтобы сесть");
         }
      }

      if (((rrIk_1)this.id_byte[id_catch[128]]).id_class() && var3 == rpm_3.OFF_HAND) {
         rdn_3 var17 = ((cb_3)id_import.id_class[id_catch[129]]).ss();
         boolean var9 = var17.id_break() != rdy_3.xe && !(var17.id_break() instanceof rkX_2) ? id_implements[44] : id_implements[43];
         if (var9 && rrjS_2.id_break(var2)) {
            var1.id_class(id_implements[45]);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1100990099058116760L;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_this();
      super.id_class(var1);

      for (rrTF var3 : (List)this.id_byte[id_catch[140]]) {
         var3.aI_();
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_this();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[130]]) {
         ((rrfP_2)this.id_byte[id_catch[131]]).id_class(rqR_2.id_break() - this.id_byte[id_catch[132]] > id_throws[1] ? id_implements[46] : id_implements[47]);
         this.id_instanceof();
         if (((rrIk_1)this.id_byte[id_catch[133]]).id_class()) {
            long var2 = C_throws.id_byte().id_native().id_byte();
            if (var2 > id_throws[2] && (Long)this.id_byte[id_catch[134]] != var2 && ((rrfw_3)this.id_byte[id_catch[135]]).id_class(id_private[0])) {
               ((cb_3)id_import.id_class[id_catch[136]]).id_protected(id_finally[43]);
               Long var8 = var2;
               this.id_byte[id_catch[137]] = var8;
               ((rrfw_3)this.id_byte[id_catch[138]]).id_class();
            }
         }
      }
   }

   public rryT id_break(String var1) {
      if (var1.equalsIgnoreCase(id_finally[44])) {
         return (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[id_catch[163]];
      } else {
         return var1.equalsIgnoreCase(id_finally[45]) ? (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[id_catch[164]] : null;
      }
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_this();
      super.id_throws(var1);

      for (rrTF var3 : (List)this.id_byte[id_catch[141]]) {
         var3.aK_();
      }

      this.id_instanceof();
      Object var8 = null;
      this.id_byte[id_catch[142]] = var8;
      Boolean var9 = id_implements[48];
      this.id_byte[id_catch[143]] = var9;
      Long var10 = id_throws[3];
      this.id_byte[id_catch[144]] = var10;
      ((rrfw_3)this.id_byte[id_catch[145]]).id_class();
   }

   private String id_catch(String var1) {
      String[] var2 = (String[])id_break[id_catch[159]];
      int var3 = var2.length;

      for (int var4 = id_implements[50]; var4 < var3; var4++) {
         String var5 = var2[var4];
         if (var5.equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return null;
   }

   private String id_goto() {
      return "/clan create " + RandomStringUtils.randomAlphabetic(id_protected[35]);
   }

   public boolean id_continue() {
      this.id_this();
      return ((rrIk_1)this.id_byte[id_catch[158]]).id_class();
   }

   private static void id_else() {
      Object[] var0 = new Object[2];
      String[] var2 = new String[]{id_finally[46], id_finally[47], id_finally[48], id_finally[49], id_finally[50]};
      var0[0] = var2;
      String[] var3 = new String[]{id_finally[51], id_finally[52], id_finally[53], id_finally[54], id_finally[55], id_finally[56]};
      var0[1] = var3;
      id_break = var0;
   }

   private void id_instanceof() {
      this.id_this();
      if ((Integer)this.id_byte[id_catch[146]] != id_protected[32]) {
         if ((Integer)this.id_byte[id_catch[147]] >= id_protected[33]) {
            ((Ax_1)id_import.id_class[id_catch[148]]).id_class((Integer)this.id_byte[id_catch[149]]);
         } else {
            rrfo_3.id_class((Integer)this.id_byte[id_catch[150]]);
         }

         Integer var5 = Integer.valueOf(id_protected[34]);
         this.id_byte[id_catch[151]] = var5;
      }
   }

   public boolean id_new() {
      this.id_this();
      return ((rrIk_1)this.id_byte[id_catch[157]]).id_class();
   }

   private static void id_return() {
      id_finally = new String[]{
         new String("FT Helper"),
         new String("Утилитарный модуль для Funtime"),
         new String("Улучшать команды"),
         new String("Улучшать информацию о\nпредметах на аукционе"),
         new String("Уведомлять когда на вас\nналожили плохие эффекты"),
         new String("Авто. перевыставление\nпредметов в хранилище"),
         new String("Авто. инвестирование в\nклан"),
         new String("Авто. добавление друзей в\nрегион"),
         new String("Позволять открывать\nшалкер внутри шалкера"),
         new String("Не ставить сферы"),
         new String("Чат"),
         new String("Аукцион"),
         new String("Другое"),
         new String("Авто-шахта"),
         new String("☃ Хранилище"),
         new String("Цена"),
         new String("Сумма"),
         new String("Сумма"),
         new String("Сумма"),
         new String("|| Статус: »"),
         new String("До следующего ивента"),
         new String("[^0-9]"),
         new String(""),
         new String("[⚔] Ошибка, клан с таким названием уже существует!"),
         new String("[⚔] Супер! Вы успешно создали клан:"),
         new String("[⚔] Ошибка: Ты уже состоишь в клане!"),
         new String("[^0-9]"),
         new String(""),
         new String("/clan money"),
         new String("/money"),
         new String("Зелье Радиации"),
         new String("Снотворное"),
         new String("На вас наложили "),
         new String(", используйте божью ауру"),
         new String("На вас наложили "),
         new String(", используйте молоко"),
         new String("На вас наложили "),
         new String("display"),
         new String("display"),
         new String("Lore"),
         new String("Lore"),
         new String("Ценa"),
         new String("Цена"),
         new String("/clan invest max"),
         new String("withdraw"),
         new String("invest"),
         new String("my"),
         new String("me"),
         new String("i"),
         new String("я"),
         new String("мой"),
         new String("full"),
         new String("all"),
         new String("max"),
         new String("все"),
         new String("всё"),
         new String("макс")
      };
   }

   private static void id_super() {
      id_throws = new long[]{61000L, 300L, 0L, 0L, 0L, 0L};
   }

   private static void id_throw() {
      id_implements = new boolean[]{
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false
      };
   }

   private static void id_try() {
      id_protected = new byte[]{
         -1,
         5,
         2,
         3,
         4,
         2,
         4,
         2,
         3,
         5,
         -1,
         2,
         2,
         2,
         3,
         18,
         44,
         3,
         2,
         2,
         -1,
         -1,
         44,
         2,
         10,
         9,
         8,
         -1,
         -1,
         44,
         -1,
         9,
         -1,
         9,
         -1,
         5,
         32,
         5,
         2,
         3,
         4,
         6,
         2,
         3,
         4,
         5,
         37,
         32,
         33,
         34,
         35,
         2
      };
   }

   private static void id_while() {
      id_catch = new short[]{
         4,
         0,
         22,
         23,
         24,
         25,
         26,
         27,
         28,
         29,
         30,
         33,
         36,
         22,
         2,
         1,
         3,
         4,
         5,
         6,
         7,
         8,
         12,
         11,
         9,
         15,
         14,
         13,
         10,
         16,
         17,
         18,
         19,
         20,
         21,
         26,
         27,
         24,
         28,
         29,
         23,
         25,
         25,
         57,
         4,
         0,
         55,
         73,
         9,
         12,
         13,
         15,
         2,
         0,
         1,
         1,
         2,
         1,
         4,
         28,
         57,
         57,
         4,
         57,
         26,
         1,
         2,
         1,
         4,
         16,
         6,
         32,
         57,
         32,
         31,
         31,
         3,
         6,
         5,
         57,
         31,
         31,
         1,
         2,
         1,
         4,
         27,
         4,
         57,
         26,
         12,
         10,
         13,
         14,
         11,
         0,
         32,
         31,
         3,
         24,
         57,
         5,
         6,
         7,
         23,
         1,
         2,
         1,
         4,
         0,
         0,
         1,
         2,
         1,
         4,
         57,
         1,
         30,
         57,
         1,
         33,
         55,
         34,
         57,
         1,
         33,
         57,
         0,
         29,
         57,
         0,
         30,
         34,
         26,
         35,
         36,
         57,
         35,
         36,
         30,
         0,
         0,
         31,
         32,
         35,
         36,
         33,
         33,
         55,
         33,
         33,
         33,
         0,
         3000,
         4,
         0,
         17,
         22,
         25,
         0,
         1,
         0,
         0,
         3,
         4
      };
   }

   private static void id_public() {
      id_private = new double[]{10000.0};
   }

   private String id_protected(String var1) {
      String[] var2 = (String[])id_break[id_catch[160]];
      int var3 = var2.length;

      for (int var4 = id_implements[51]; var4 < var3; var4++) {
         String var5 = var2[var4];
         if (var5.equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return null;
   }
}

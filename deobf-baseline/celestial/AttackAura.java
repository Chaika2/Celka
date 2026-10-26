package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class AttackAura extends Module implements rrnF_2, rrnL_2 {
   private static double[] id_byte;
   private static short[] id_protected;
   private static float[] id_throws;
   private static long[] id_catch;
   private static String[] id_private;
   private static byte[] id_implements;
   public Object[] id_break;
   private static boolean[] id_finally;
   private rrIk_1 celestialSilentRotation;

   public rrIk_1 id_boolean() {
      this.u();
      return (rrIk_1)this.id_break[id_protected[172]];
   }

   public boolean id_char() {
      return id_finally[75];
   }

   public rrnD_2 id_long() {
      this.u();
      return (rrnD_2)this.id_break[id_protected[154]];
   }

   public boolean id_float() {
      this.u();
      return !this.S().id_byte().equals(id_private[57]) && (rrnK_2)this.id_break[id_protected[148]] != (rrCs_1)this.id_break[id_protected[149]]
         ? id_finally[69]
         : id_finally[68];
   }

   public rrIk_1 id_double() {
      this.u();
      return (rrIk_1)this.id_break[id_protected[165]];
   }

   public AttackAura() {
      super(id_private[0], id_private[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_protected[0]]);
      this.u();
      rqO_2 var5 = new rqO_2(id_private[2]);
      this.id_break[id_protected[1]] = var5;
      rrfP_2 var6 = new rrfP_2();
      this.id_break[id_protected[2]] = var6;
      CheckGroup var7 = new CheckGroup()
         .id_catch(id_finally[0])
         .id_case(id_finally[1])
         .id_throws(id_finally[2])
         .id_implements(id_finally[3])
         .id_byte(id_finally[4])
         .id_protected(id_finally[5])
         .id_class(id_finally[6]);
      this.id_break[id_protected[3]] = var7;
      rrnD_2 var8 = new rrnD_2(this);
      this.id_break[id_protected[4]] = var8;
      String var10003 = id_private[3];
      String var10004 = id_private[4];
      String[] var10005 = new String[id_implements[0]];
      var10005[id_finally[7]] = id_private[5];
      var10005[id_finally[8]] = id_private[6];
      var10005[id_implements[1]] = id_private[7];
      var10005[id_implements[2]] = id_private[8];
      rrIQ var9 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_protected[5]] = var9;
      var10003 = id_private[9];
      var10004 = id_private[10];
      var10005 = new String[id_implements[3]];
      var10005[id_finally[9]] = id_private[11];
      var10005[id_finally[10]] = id_private[12];
      var10005[id_implements[4]] = id_private[13];
      var10005[id_implements[5]] = id_private[14];
      rrIQ var10 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_protected[6]] = var10;
      var10003 = id_private[15];
      var10004 = id_private[16];
      var10005 = new String[id_implements[6]];
      var10005[id_finally[11]] = id_private[17];
      var10005[id_finally[12]] = id_private[18];
      rrIQ var11 = new rrIQ(var10003, var10004, var10005).id_class(id_private[19], (var1, var2) -> {
         this.u();
         rrnD_2 var10000 = (rrnD_2)this.id_break[id_protected[220]];
         Integer var7x = Integer.valueOf(id_finally[98]);
         var10000.id_break[id_protected[221]] = var7x;
         var10000 = (rrnD_2)this.id_break[id_protected[222]];
         Integer var8x = Integer.valueOf(id_finally[99]);
         var10000.id_break[id_protected[223]] = var8x;
      });
      this.id_break[id_protected[7]] = var11;
      var10003 = id_private[20];
      var10004 = id_private[21];
      var10005 = new String[id_implements[7]];
      var10005[id_finally[13]] = id_private[22];
      var10005[id_finally[14]] = id_private[23];
      var10005[id_implements[8]] = id_private[24];
      var10005[id_implements[9]] = id_private[25];
      rrIQ var12 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_protected[8]] = var12;
      rrIk_1 var13 = new rrIk_1(id_private[26], id_finally[15]).id_class(() -> {
         this.u();
         return !((rrIQ)this.id_break[id_protected[219]]).id_byte().equals(id_private[63]) ? id_finally[96] : id_finally[97];
      });
      this.id_break[id_protected[9]] = var13;
      rrIk_1 var14 = new rrIk_1(id_private[27], id_finally[16])
         .id_class(
            () -> {
               this.u();
               return !((rrIQ)this.id_break[id_protected[217]]).id_byte().equals(id_private[62]) && !((rrIk_1)this.id_break[id_protected[218]]).id_class()
                  ? id_finally[95]
                  : id_finally[94];
            }
         );
      this.id_break[id_protected[10]] = var14;
      rrIm_1 var15 = new rrIm_1(id_private[28], id_throws[0], id_throws[1], id_throws[2], id_throws[3])
         .id_class(((rrIk_1)this.id_break[id_protected[11]])::id_class);
      this.id_break[id_protected[12]] = var15;
      rrIm_1 var16 = new rrIm_1(id_private[29], id_throws[4], id_throws[5], id_throws[6], id_throws[7]);
      this.id_break[id_protected[13]] = var16;
      rrIm_1 var17 = new rrIm_1(id_private[30], id_throws[8], id_throws[9], id_throws[10], id_throws[11]);
      this.id_break[id_protected[14]] = var17;
      rrIk_1 var18 = new rrIk_1(id_private[31], id_finally[17]);
      this.id_break[id_protected[15]] = var18;
      rrIk_1 var19 = new rrIk_1(id_private[32], id_finally[18]).id_class(((rrIk_1)this.id_break[id_protected[16]])::id_class);
      this.id_break[id_protected[17]] = var19;
      rrIk_1 var20 = new rrIk_1(id_private[33], id_finally[19]);
      this.id_break[id_protected[18]] = var20;
      rrIk_1 var21 = new rrIk_1(id_private[34], id_finally[20]).id_class(((rrIk_1)this.id_break[id_protected[19]])::id_class);
      this.id_break[id_protected[20]] = var21;
      rrIk_1 var22 = new rrIk_1(id_private[35], id_finally[21]);
      this.id_break[id_protected[21]] = var22;
      rrIk_1 var23 = new rrIk_1(id_private[36], id_finally[22]);
      this.id_break[id_protected[22]] = var23;
      rrIk_1 var24 = new rrIk_1(id_private[37], id_finally[23])
         .id_class(
            () -> (rrfq_3)rrfp_3.id_class[id_protected[213]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[214]]
                     && (rrfq_3)rrfp_3.id_class[id_protected[215]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[216]]
                  ? id_finally[92]
                  : id_finally[93]
         );
      this.id_break[id_protected[23]] = var24;
      rrIk_1 var25 = new rrIk_1(id_private[38], id_finally[24])
         .id_class(
            () -> (rrfq_3)rrfp_3.id_class[id_protected[211]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[212]]
                  ? id_finally[90]
                  : id_finally[91]
         );
      this.id_break[id_protected[24]] = var25;
      rrIk_1 var26 = new rrIk_1(id_private[39], id_finally[25]);
      this.id_break[id_protected[25]] = var26;
      rrIk_1 var27 = new rrIk_1(id_private[40], id_finally[26]);
      this.id_break[id_protected[26]] = var27;
      rrIk_1 var28 = new rrIk_1(id_private[41], id_finally[27]);
      this.id_break[id_protected[27]] = var28;
      rrIk_1 var29 = new rrIk_1(id_private[42], id_finally[28]);
      this.id_break[id_protected[28]] = var29;
      lD_2 var30 = new lD_2(id_protected[29]);
      this.id_break[id_protected[30]] = var30;
      AnimValue var31 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_protected[31]], id_throws[12], id_finally[29]);
      this.id_break[id_protected[32]] = var31;
      rrne_3 var32 = new rrne_3();
      this.id_break[id_protected[33]] = var32;
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[34]]).id_finally().id_break((rrne_3)this.id_break[id_protected[35]]);
      Setting[] var10001 = new Setting[id_implements[10]];
      byte var42 = id_finally[30];
      String var10006 = id_private[43];
      Setting[] var10007 = new Setting[id_implements[11]];
      var10007[id_finally[31]] = new rrIc_1(id_private[44], ((CheckGroup)this.id_break[id_protected[36]]).id_byte());
      var10007[id_finally[32]] = (rrIQ)this.id_break[id_protected[37]];
      var10001[var42] = new GroupSetting(var10006, var10007);
      byte var43 = id_finally[33];
      String var63 = id_private[45];
      Setting[] var10008 = new Setting[id_implements[12]];
      var10008[id_finally[34]] = (rrIQ)this.id_break[id_protected[38]];
      var10008[id_finally[35]] = (rrIQ)this.id_break[id_protected[39]];
      GroupSetting var33;
      GroupSetting var53 = var33 = new GroupSetting(var63, var10008);
      this.id_break[id_protected[40]] = var33;
      var10001[var43] = var53;
      byte var44 = id_implements[13];
      var10006 = id_private[46];
      var10007 = new Setting[id_implements[14]];
      var10007[id_finally[36]] = (rrIQ)this.id_break[id_protected[41]];
      var10007[id_finally[37]] = (rrIk_1)this.id_break[id_protected[42]];
      var10007[id_implements[15]] = (rrIk_1)this.id_break[id_protected[43]];
      var10007[id_implements[16]] = (rrIm_1)this.id_break[id_protected[44]];
      var10001[var44] = new GroupSetting(var10006, var10007);
      byte var45 = id_implements[17];
      var10006 = id_private[47];
      var10007 = new Setting[id_implements[18]];
      var10007[id_finally[38]] = (rrIm_1)this.id_break[id_protected[45]];
      var10007[id_finally[39]] = (rrIm_1)this.id_break[id_protected[46]];
      var10001[var45] = new GroupSetting(var10006, var10007);
      byte var46 = id_implements[19];
      var10006 = id_private[48];
      var10007 = new Setting[id_implements[20]];
      var10007[id_finally[40]] = (rrIk_1)this.id_break[id_protected[47]];
      var10007[id_finally[41]] = (rrIk_1)this.id_break[id_protected[48]];
      var10007[id_implements[21]] = (rrIk_1)this.id_break[id_protected[49]];
      var10007[id_implements[22]] = (rrIk_1)this.id_break[id_protected[50]];
      var10007[id_implements[23]] = (rrIk_1)this.id_break[id_protected[51]];
      var10007[id_implements[24]] = (rrIk_1)this.id_break[id_protected[52]];
      var10001[var46] = new GroupSetting(var10006, var10007);
      byte var47 = id_implements[25];
      var10006 = id_private[49];
      var10007 = new Setting[id_finally[42]];
      var10007[id_finally[43]] = (rrIk_1)this.id_break[id_protected[53]];
      var10001[var47] = new GroupSetting(var10006, var10007);
      byte var48 = id_implements[26];
      var10006 = id_private[50];
      var10007 = new Setting[id_finally[44]];
      byte var10009 = id_finally[45];
      String var10012 = id_private[51];
      rrIk_1[] var10013 = new rrIk_1[id_implements[27]];
      var10013[id_finally[46]] = (rrIk_1)this.id_break[id_protected[54]];
      var10013[id_finally[47]] = (rrIk_1)this.id_break[id_protected[55]];
      var10007[var10009] = new rrIc_1(var10012, var10013);
      var10001[var48] = new GroupSetting(var10006, var10007);
      byte var49 = id_implements[28];
      var10006 = id_private[52];
      var10007 = new Setting[id_implements[29]];
      var10007[id_finally[48]] = (rrIk_1)this.id_break[id_protected[56]];
      var10007[id_finally[49]] = (rrIk_1)this.id_break[id_protected[57]];
      var10007[id_implements[30]] = (rrIk_1)this.id_break[id_protected[58]];
      var10001[var49] = new GroupSetting(var10006, var10007);
      this.id_class(var10001);
      rrCr_1 var34 = new rrCr_1(this);
      this.id_break[id_protected[59]] = var34;
      rrCP var35 = new rrCP(this);
      this.id_break[id_protected[60]] = var35;
      rrna_3 var36 = new rrna_3(this);
      this.id_break[id_protected[61]] = var36;
      rrCs_1 var37 = new rrCs_1(this);
      this.id_break[id_protected[62]] = var37;
      rrna_3 var38 = (rrna_3)this.id_break[id_protected[63]];
      this.id_break[id_protected[64]] = var38;
      ((rrIQ)this.id_break[id_protected[65]]).id_class(id_private[53], (var1, var2) -> {
         this.u();
         if ((rrnK_2)this.id_break[id_protected[202]] != null && this.aJ_()) {
            ((rrnK_2)this.id_break[id_protected[203]]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = id_implements[37];
         switch (var3.hashCode()) {
            case -1997372447:
               if (var3.equals(id_private[58])) {
                  var4 = id_finally[88];
               }
               break;
            case -912404296:
               if (var3.equals(id_private[61])) {
                  var4 = id_implements[39];
               }
               break;
            case 2581482:
               if (var3.equals(id_private[59])) {
                  var4 = id_finally[89];
               }
               break;
            case 1155506348:
               if (var3.equals(id_private[60])) {
                  var4 = id_implements[38];
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrCr_1)this.id_break[id_protected[204]];
            case 1 -> (rrCP)this.id_break[id_protected[205]];
            case 2 -> (rrna_3)this.id_break[id_protected[206]];
            case 3 -> (rrCs_1)this.id_break[id_protected[207]];
            default -> null;
         };
         this.id_break[id_protected[208]] = var9x;
         if ((rrnK_2)this.id_break[id_protected[209]] != null && this.aJ_()) {
            ((rrnK_2)this.id_break[id_protected[210]]).aI_();
         }
      });
      ((rrIm_1)this.id_break[id_protected[66]]).id_class(() -> {
         this.u();
         return !this.M() && (rrnK_2)this.id_break[id_protected[200]] != (rrna_3)this.id_break[id_protected[201]] ? id_finally[86] : id_finally[87];
      });
      ((rrIQ)this.id_break[id_protected[67]]).id_class(() -> {
         this.u();
         return (rrnK_2)this.id_break[id_protected[198]] != (rrCs_1)this.id_break[id_protected[199]] ? id_finally[84] : id_finally[85];
      });
      ((rrIk_1)this.id_break[id_protected[68]])
         .id_class(
            () -> {
               this.u();
               return (rrfq_3)rrfp_3.id_class[id_protected[194]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[195]]
                     && (rrnK_2)this.id_break[id_protected[196]] == (rrCs_1)this.id_break[id_protected[197]]
                  ? id_finally[83]
                  : id_finally[82];
            }
         );
      ((rrIk_1)this.id_break[id_protected[69]])
         .id_class(
            () -> {
               this.u();
               return (rrfq_3)rrfp_3.id_class[id_protected[190]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[191]]
                     && (rrnK_2)this.id_break[id_protected[192]] == (rrCs_1)this.id_break[id_protected[193]]
                  ? id_finally[81]
                  : id_finally[80];
            }
         );
      ((rrIk_1)this.id_break[id_protected[70]])
         .id_class(
            () -> {
               this.u();
               return (rrfq_3)rrfp_3.id_class[id_protected[186]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[187]]
                     && (rrnK_2)this.id_break[id_protected[188]] == (rrCs_1)this.id_break[id_protected[189]]
                  ? id_finally[79]
                  : id_finally[78];
            }
         );
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[71]])
         .id_finally()
         .id_class(
            new OH<>(
               RenderEvent.class,
               var1 -> {
                  this.u();
                  ((AnimValue)this.id_break[id_protected[179]])
                     .id_class(
                        (iB_2)this.id_break[id_protected[180]] != null && ((rrIk_1)this.id_break[id_protected[181]]).id_class()
                           ? id_finally[76]
                           : id_finally[77]
                     );
                  if ((iB_2)this.id_break[id_protected[182]] != null && ((AnimValue)this.id_break[id_protected[183]]).id_case()) {
                     this.id_class(var1, (iB_2)this.id_break[id_protected[184]], ((AnimValue)this.id_break[id_protected[185]]).id_byte());
                  }
               }
            )
         );
      this.celestialSilentRotation = new rrIk_1("Silent", true);
      this.id_class(this.celestialSilentRotation);
   }

   static {
      ntfClinit();
   }

   public boolean B() {
      return this.id_else().id_class() && C_throws.id_byte().id_return().id_class() ? id_finally[66] : id_finally[67];
   }

   private static void J() {
      id_implements = new byte[]{
         4, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 2, 2, 2, 4, 2, 3, 3, 2, 4, 6, 2, 3, 4, 5, 5, 6, 2, 7, 3, 2, 14, 7, 4, 15, -1, 2, -1, 2, 3, 36
      };
   }

   public rrIQ S() {
      this.u();
      return (rrIQ)this.id_break[id_protected[157]];
   }

   public rrIk_1 id_this() {
      this.u();
      return (rrIk_1)this.id_break[id_protected[170]];
   }

   private static void x() {
      id_catch = new long[]{200L};
   }

   public boolean s() {
      return (rrfq_3)rrfp_3.id_class[id_protected[150]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[151]] && this.id_void()
         ? id_finally[70]
         : id_finally[71];
   }

   private static void c() {
      id_throws = new float[]{
         1.0F,
         0.5F,
         2.5F,
         0.1F,
         3.0F,
         1.0F,
         6.0F,
         0.1F,
         0.0F,
         0.0F,
         32.0F,
         0.5F,
         0.5F,
         2.0F,
         0.2F,
         255.0F,
         0.4F,
         0.5F,
         -0.5F,
         -0.5F,
         0.0F,
         0.0F,
         0.0F,
         0.5F,
         -0.5F,
         0.0F,
         1.0F,
         0.0F,
         0.5F,
         0.5F,
         0.0F,
         1.0F,
         1.0F,
         -0.5F,
         0.5F,
         0.0F,
         0.0F,
         1.0F,
         Float.MAX_VALUE
      };
   }

   private void h() {
      this.u();
      if (((rrIk_1)this.id_break[id_protected[98]]).id_class()) {
         for (cG_2 var2 : ((gm_3)id_import.id_class[id_protected[99]]).id_continue()) {
            if (var2 instanceof cM_2 var3) {
               var3.id_else();
            }
         }
      }
   }

   private void l() {
      this.u();
      this.id_break(this.id_long().id_class((CheckGroup)this.id_break[id_protected[97]]));
   }

   private void d() {
      this.u();
      if (((rrIk_1)this.id_break[id_protected[100]]).id_class()) {
         for (cG_2 var2 : ((gm_3)id_import.id_class[id_protected[101]]).id_continue()) {
            if (var2 instanceof cM_2 var3) {
               var3.id_public();
            }
         }
      }
   }

   public rrIQ id_interface() {
      this.u();
      return (rrIQ)this.id_break[id_protected[155]];
   }

   public void id_class(iB_2 var1) {
      this.u();
      this.id_break[id_protected[176]] = var1;
   }

   @Override
   public float id_class(rjU_2 var1, rjU_2 var2) {
      return this.P().id_class(var1, var2);
   }

   @EventTarget
   public void id_class(rrAS var1) {
      this.u();
      if ((Integer)((rrnD_2)this.id_break[id_protected[87]]).id_break[id_protected[88]] > 0) {
         var1.id_class(id_finally[54]);
      }
   }

   @Override
   public List<rrTA> id_class(an_3 var1, rfl_3 var2) {
      return this.P().id_class(var1, var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3024045055217266005L;
   }

   private void id_class(Pair<iM_2, iM_2> var1) {
      this.u();
      if (var1 != null && (iB_2)this.id_break[id_protected[121]] != null) {
         ((cb_3)id_import.id_class[id_protected[122]]).id_class((iM_2)var1.getLeft());
         ((iB_2)this.id_break[id_protected[123]]).id_class((iM_2)var1.getRight());
      }
   }

   @Override
   public Pair<rrTA, rrTA> id_class(an_3 var1, PX var2) {
      return this.P().id_class(var1, var2);
   }

   @EventTarget
   public void id_class(rrAF var1) {
      this.u();
      if ((Integer)((rrnD_2)this.id_break[id_protected[89]]).id_break[id_protected[90]] > 0) {
         var1.id_class(id_finally[55]);
      }
   }

   @Override
   public boolean id_class(PX var1) {
      return this.P().id_class(var1);
   }

   @EventTarget
   public void id_class(rrAM var1) {
      this.id_break(null);
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.u();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[72]]) {
         if ((Integer)((rrnD_2)this.id_break[id_protected[73]]).id_break[id_protected[74]] > 0 && ((cb_3)id_import.id_class[id_protected[75]]).BL()) {
            rrnD_2 var10000 = (rrnD_2)this.id_break[id_protected[76]];
            Integer var7 = (Integer)((rrnD_2)this.id_break[id_protected[76]]).id_break[id_protected[77]] - id_finally[50];
            var10000.id_break[id_protected[78]] = var7;
         }

         if ((Integer)((rrnD_2)this.id_break[id_protected[79]]).id_break[id_protected[80]] > 0) {
            rrnD_2 var9 = (rrnD_2)this.id_break[id_protected[81]];
            Integer var8 = (Integer)((rrnD_2)this.id_break[id_protected[81]]).id_break[id_protected[82]] - id_finally[51];
            var9.id_break[id_protected[83]] = var8;
         }

         if (((Ax_1)id_import.id_class[id_protected[84]]).id_finally()) {
            this.id_break(null);
            return;
         }

         this.h();
         this.l();
         Pair var2 = this.m();
         this.P().id_class(var1);
         this.celestialApplyClientRotation();
         this.id_class(var2);
         this.d();
         ((rrfP_2)this.id_break[id_protected[85]])
            .id_class(System.currentTimeMillis() - ((rrnD_2)this.id_break[id_protected[86]]).id_protected() > id_catch[0] ? id_finally[52] : id_finally[53]);
      } else {
         this.P().id_class(var1);
         this.celestialApplyClientRotation();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -264689968;
   }

   private void id_class(RenderEvent var1, iB_2 var2, float var3) {
      this.u();
      Ml_1 var4 = var1.id_class();
      float var5 = var1.id_byte();
      double var6 = rrjZ_2.id_protected(var2, var5);
      double var8 = rrjZ_2.id_break(var2, var5);
      double var10 = rrjZ_2.id_byte(var2, var5);
      float var12 = var2.Bm() / id_throws[13] + id_throws[14];
      float var13 = var2.PN();
      int var14 = (int)(id_throws[15] * var3);
      byte var15 = id_implements[31];
      double var16 = (double)System.currentTimeMillis() / id_byte[0];
      double var18 = var16 * id_byte[1] % id_byte[2];
      double var20 = Math.toRadians(id_byte[3]);
      double var22 = Math.toRadians(id_byte[4]);
      double var24 = (var22 - var20) / (double)var15;
      RenderSystem.disableCull();
      RenderSystem.disableAlphaTest();
      RenderSystem.disableDepthTest();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(id_protected[104], id_finally[58]);
      id_static.id_class((rqO_2)this.id_break[id_protected[105]]);
      id_strictfp.id_class(id_implements[32], ju_3.id_public);
      rjY_2 var26 = id_void.id_byte();
      double var27 = id_void.id_case();
      double var29 = id_void.id_catch();
      double var31 = id_void.id_private();

      for (int var33 = id_finally[59]; var33 < id_implements[33]; var33++) {
         double var34 = var16 + (double)(var33 * id_implements[34]);
         double var36 = (double)var33 * id_byte[5];

         for (int var38 = id_finally[60]; var38 <= var15; var38++) {
            double var39 = var20 + (double)var38 * var24;
            var4.id_class();
            double var41 = var39 + var18 + var36;
            double var43 = var6 + (double)var13 * Math.cos(var41);
            double var45 = var8 + Math.sin(var34 + var39 + (double)var33) * id_byte[6] + (double)var12;
            double var47 = var10 + (double)var13 * Math.sin(var41);
            float var49 = id_throws[16] * (id_throws[17] + (float)var38 / (float)var15);
            int var50 = ColorHelper.id_class((float)(var38 * var15), var14);
            var4.id_class(var43 - var27, var45 - var29, var47 - var31);
            var4.id_class(var26);
            var4.id_class(var49, var49, var49);
            rjV_2 var51 = var4.id_byte().id_class();
            id_strictfp.id_class(var51, id_throws[18], id_throws[19], id_throws[20]).id_class(id_throws[21], id_throws[22]).id_class(var50).id_class();
            id_strictfp.id_class(var51, id_throws[23], id_throws[24], id_throws[25]).id_class(id_throws[26], id_throws[27]).id_class(var50).id_class();
            id_strictfp.id_class(var51, id_throws[28], id_throws[29], id_throws[30]).id_class(id_throws[31], id_throws[32]).id_class(var50).id_class();
            id_strictfp.id_class(var51, id_throws[33], id_throws[34], id_throws[35]).id_class(id_throws[36], id_throws[37]).id_class(var50).id_class();
            var4.id_break();
         }
      }

      id_default.id_break();
      RenderSystem.blendFunc(id_protected[106], id_protected[107]);
      RenderSystem.enableDepthTest();
      RenderSystem.enableTexture();
      RenderSystem.enableAlphaTest();
      RenderSystem.enableCull();
   }

   @EventTarget
   public void id_class(rrAR var1) {
      this.u();
      if (((rrIk_1)this.id_break[id_protected[92]]).id_class() && (iB_2)this.id_break[id_protected[93]] != null) {
         var1.id_class(id_finally[56]);
      }
   }

   @Override
   public boolean id_class(xc_3 var1) {
      this.u();
      return ((rrnK_2)this.id_break[id_protected[135]]).id_class(var1);
   }

   @Override
   public void id_class(boolean var1) {
      if (this.P().aI_()) {
         super.id_class(var1);
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.u();
      ((rrfP_2)this.id_break[id_protected[91]]).id_class(var1);
   }

   @EventTarget
   public void id_class(rrLe_1 var1) {
      this.u();
      if (((rrIk_1)this.id_break[id_protected[94]]).id_class() && (iB_2)this.id_break[id_protected[95]] != null) {
         var1.id_class(id_finally[57]);
      }
   }

   private Pair<iM_2, iM_2> m() {
      this.u();
      if (!((rrIk_1)this.id_break[id_protected[108]]).id_class()) {
         return null;
      } else {
         iM_2 var1 = null;
         iM_2 var2 = null;
         if ((iB_2)this.id_break[id_protected[109]] != null) {
            var1 = ((cb_3)id_import.id_class[id_protected[110]]).Pb();
            var2 = ((iB_2)this.id_break[id_protected[111]]).Pb();
            if (((cb_3)id_import.id_class[id_protected[112]])
                  .id_class((iB_2)this.id_break[id_protected[113]], iM_2.STANDING, ((iB_2)this.id_break[id_protected[114]]).Pb())
               > ((cb_3)id_import.id_class[id_protected[115]]).id_class((iB_2)this.id_break[id_protected[116]], iM_2.FALL_FLYING, iM_2.STANDING)) {
               ((cb_3)id_import.id_class[id_protected[117]]).id_class(iM_2.FALL_FLYING);
               ((iB_2)this.id_break[id_protected[118]]).id_class(iM_2.STANDING);
            } else {
               ((cb_3)id_import.id_class[id_protected[119]]).id_class(iM_2.STANDING);
               ((iB_2)this.id_break[id_protected[120]]).id_class(var2);
            }
         }

         return Pair.of(var1, var2);
      }
   }

   public Y id_default() {
      return (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[103]];
   }

   private static void v() {
      id_finally = new boolean[]{
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
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
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false
      };
   }

   public boolean id_short() {
      return id_finally[74];
   }

   private static void z() {
      id_protected = new short[]{
         0,
         4,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         14,
         15,
         16,
         17,
         18,
         18,
         19,
         20,
         18,
         21,
         22,
         23,
         24,
         25,
         26,
         27,
         28,
         29,
         256,
         30,
         3,
         33,
         35,
         0,
         35,
         7,
         9,
         10,
         11,
         34,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         23,
         27,
         22,
         20,
         21,
         19,
         28,
         29,
         24,
         25,
         26,
         0,
         1,
         2,
         3,
         2,
         5,
         10,
         17,
         11,
         23,
         20,
         21,
         0,
         0,
         8,
         5,
         57,
         8,
         5,
         5,
         8,
         6,
         8,
         6,
         6,
         55,
         6,
         8,
         8,
         5,
         8,
         6,
         6,
         26,
         31,
         26,
         31,
         8,
         7,
         25,
         56,
         25,
         56,
         5,
         0,
         770,
         4,
         770,
         771,
         24,
         31,
         57,
         31,
         57,
         31,
         31,
         57,
         31,
         57,
         31,
         57,
         31,
         31,
         57,
         31,
         31,
         31,
         31,
         31,
         32,
         16,
         24,
         5,
         2,
         17,
         23,
         5,
         13,
         31,
         31,
         2,
         12,
         0,
         1,
         2,
         3,
         14,
         15,
         28,
         5,
         3,
         1,
         4,
         3,
         6,
         8,
         9,
         10,
         11,
         12,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         23,
         24,
         25,
         26,
         27,
         28,
         29,
         30,
         31,
         32,
         32,
         34,
         35,
         33,
         31,
         29,
         32,
         33,
         32,
         33,
         1,
         4,
         5,
         3,
         1,
         4,
         5,
         3,
         1,
         4,
         5,
         3,
         5,
         3,
         5,
         2,
         5,
         5,
         0,
         1,
         2,
         3,
         5,
         5,
         5,
         1,
         2,
         1,
         2,
         1,
         4,
         12,
         13,
         12,
         8,
         6,
         8,
         7
      };
   }

   public boolean id_void() {
      this.u();
      return this.P() == (rrCs_1)this.id_break[id_protected[152]] ? id_finally[72] : id_finally[73];
   }

   private void u() {
      if (this.id_break == null) {
         this.id_break = new Object[36];
      }
   }

   public rrIm_1 r() {
      this.u();
      return (rrIm_1)this.id_break[id_protected[159]];
   }

   @Override
   public float id_break() {
      return this.P().id_byte();
   }

   @Override
   public float id_break(rjU_2 var1, rjU_2 var2) {
      return this.P().id_break(var1, var2);
   }

   public void id_break(iB_2 var1) {
      this.u();
      if (var1 == null && (iB_2)this.id_break[id_protected[124]] != null) {
         this.P().id_volatile();
      }

      this.id_break[id_protected[125]] = var1;
      if ((iB_2)this.id_break[id_protected[126]] != null) {
         iB_2 var7 = (iB_2)this.id_break[id_protected[127]];
         this.id_break[id_protected[128]] = var7;
      }
   }

   @Override
   public boolean id_break(PX var1) {
      return this.P().id_break(var1);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{121, -31, 35, 84, -35, -16, -113, -123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.u();
      rrnK_2 var2 = this.P();
      if (var2.aK_()) {
         super.id_throws(var1);
         this.id_break(null);
      }

      var2.id_throws();
      ((rrnD_2)this.id_break[id_protected[96]]).id_byte();
   }

   private boolean M() {
      return this.P().id_break();
   }

   public rrnK_2 P() {
      this.u();
      return (rrnK_2)this.id_break[id_protected[102]];
   }

   @Override
   public rrTp_1 id_catch() {
      this.u();
      if (((rrIk_1)this.id_break[id_protected[136]]).id_class() && (iB_2)this.id_break[id_protected[137]] != null) {
         rdn_3[] var1 = rrfH_2.id_class((iB_2)this.id_break[id_protected[138]]);
         int var2 = var1.length;

         for (int var3 = id_finally[63]; var3 < var2; var3++) {
            rdn_3 var4 = var1[var3];
            if (var4.id_break() == rdy_3.OM || var4.id_break() == rdy_3.kU || var4.id_break() == rdy_3.kY) {
               return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_protected[139]];
            }
         }
      }

      String var5 = ((rrIQ)this.id_break[id_protected[140]]).id_byte();
      byte var6 = id_implements[35];
      switch (var5.hashCode()) {
         case -327231979:
            if (var5.equals(id_private[55])) {
               var6 = id_finally[65];
            }
            break;
         case 1248365358:
            if (var5.equals(id_private[56])) {
               var6 = id_implements[36];
            }
            break;
         case 1731698067:
            if (var5.equals(id_private[54])) {
               var6 = id_finally[64];
            }
      }
      return switch (var6) {
         case 0 -> (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_protected[141]];
         case 1 -> (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_protected[142]];
         case 2 -> (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_protected[143]];
         default -> (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_protected[144]];
      };
   }

   public float G() {
      this.u();
      if (this.id_short()) {
         return id_throws[38];
      } else {
         return !this.M() && (rrnK_2)this.id_break[id_protected[131]] != (rrna_3)this.id_break[id_protected[132]]
            ? this.id_try() + ((rrIm_1)this.id_break[id_protected[133]]).id_byte()
            : this.id_try();
      }
   }

   public rrIQ id_goto() {
      this.u();
      return (rrIQ)this.id_break[id_protected[156]];
   }

   public rrfP_2 id_const() {
      this.u();
      return (rrfP_2)this.id_break[id_protected[153]];
   }

   public iB_2 id_continue() {
      this.u();
      return (iB_2)this.id_break[id_protected[174]];
   }

   public rrIk_1 id_else() {
      this.u();
      return (rrIk_1)this.id_break[id_protected[164]];
   }

   public rrne_3 id_for() {
      this.u();
      return (rrne_3)this.id_break[id_protected[178]];
   }

   public rrIk_1 id_import() {
      this.u();
      return (rrIk_1)this.id_break[id_protected[162]];
   }

   public rrIk_1 id_instanceof() {
      this.u();
      return (rrIk_1)this.id_break[id_protected[163]];
   }

   public lD_2 id_new() {
      this.u();
      return (lD_2)this.id_break[id_protected[173]];
   }

   public rrIQ id_return() {
      this.u();
      return (rrIQ)this.id_break[id_protected[158]];
   }

   public rrIk_1 id_super() {
      this.u();
      return (rrIk_1)this.id_break[id_protected[169]];
   }

   public rrIk_1 id_switch() {
      this.u();
      return (rrIk_1)this.id_break[id_protected[166]];
   }

   public boolean id_throw() {
      this.u();
      return ((rrIk_1)this.id_break[id_protected[130]]).id_class();
   }

   public float id_try() {
      this.u();
      return ((rrIm_1)this.id_break[id_protected[129]]).id_byte();
   }

   public rrIm_1 id_while() {
      this.u();
      return (rrIm_1)this.id_break[id_protected[160]];
   }

   public GroupSetting id_static() {
      this.u();
      return (GroupSetting)this.id_break[id_protected[177]];
   }

   public rrIk_1 id_public() {
      this.u();
      return (rrIk_1)this.id_break[id_protected[161]];
   }

   @Override
   public float id_private() {
      return this.P().id_int();
   }

   public rrIk_1 id_abstract() {
      this.u();
      return (rrIk_1)this.id_break[id_protected[171]];
   }

   public rrIk_1 id_transient() {
      this.u();
      return (rrIk_1)this.id_break[id_protected[168]];
   }

   @Override
   public iB_2 id_native() {
      this.u();
      return !((rrIk_1)this.id_break[id_protected[147]]).id_class() ? null : this.id_continue();
   }

   public rrIk_1 id_strictfp() {
      this.u();
      return (rrIk_1)this.id_break[id_protected[167]];
   }

   public iB_2 E() {
      this.u();
      return (iB_2)this.id_break[id_protected[175]];
   }

   private static void X() {
      id_private = new String[]{
         new String("Attack Aura"),
         new String("Автоматически бьет окружающих\nвас существ"),
         new String("celestial/images/glow.png"),
         new String("Сортировка"),
         new String("Умная"),
         new String("Умная"),
         new String("Поле зрения"),
         new String("Дистанция"),
         new String("Здоровье"),
         new String("Режим"),
         new String("Funtime"),
         new String("Funtime"),
         new String("Matrix"),
         new String("Snap"),
         new String("SpookyTime"),
         new String("Обход спринта"),
         new String("Funtime"),
         new String("Funtime"),
         new String("Legit"),
         new String("change_mode"),
         new String("Режим"),
         new String("Незаметный"),
         new String("Незаметный"),
         new String("Строгий"),
         new String("Таргет"),
         new String("Свободный"),
         new String("Таргетить если у цели\nлук, арбалет или трезубец"),
         new String("Заходить за спину цели"),
         new String("Дистанция за спиной"),
         new String("Дистанция удара"),
         new String("Дистанция наводки"),
         new String("Только криты"),
         new String("Только с пробелом"),
         new String("Останавливать при\nиспользовании предмета"),
         new String("Останавливать при\nоткрытом контейнере"),
         new String("Бить через щит"),
         new String("Бить через стены"),
         new String("Дистанция под Grim"),
         new String("Убирать интерполяцию у\nэнтити"),
         new String("Убирать взаимодействие с\nблоками и энтити"),
         new String("Ломать щит"),
         new String("Таргет-HUD"),
         new String("ESP"),
         new String("Цели"),
         new String("Выбор"),
         new String("Обходы"),
         new String("Коррекция движения"),
         new String("Дистанции"),
         new String("Удары"),
         new String("Криты"),
         new String("Визуалы"),
         new String("Отображать"),
         new String("Другие"),
         new String("change_mode"),
         new String("Незаметный"),
         new String("Строгий"),
         new String("Таргет"),
         new String("Legit"),
         new String("Matrix"),
         new String("Snap"),
         new String("Funtime"),
         new String("SpookyTime"),
         new String("Таргет"),
         new String("Таргет")
      };
   }

   private static void Q() {
      id_byte = new double[]{1000.0, 3.0, Math.PI * 2, 0.0, 60.0, Math.PI / 2, 0.7};
   }

   @Override
   public boolean az_() {
      this.u();
      return ((rrIk_1)this.id_break[id_protected[145]]).id_class();
   }

   @Override
   public rrTH aE_() {
      return this.P().id_package();
   }

   @Override
   public rrTf_1 aL_() {
      return this.P().id_protected();
   }

   @Override
   public boolean aC_() {
      this.u();
      return !((rrIk_1)this.id_break[id_protected[134]]).id_class() ? id_finally[61] : id_finally[62];
   }

   @Override
   public float aD_() {
      this.u();
      return ((rrIm_1)this.id_break[id_protected[146]]).id_byte();
   }

   @Override
   public rrTq_1 aB_() {
      return this.P().id_case();
   }

   @Override
   public rrTj_1 aF_() {
      return this.P().id_final();
   }

   @Override
   public rrTH aA_() {
      return this.P().id_finally();
   }

   public boolean celestialSilentRotation() {
      return this.celestialSilentRotation.id_class();
   }

   private void celestialApplyClientRotation() {
      if (!this.celestialSilentRotation() && this.id_continue() != null) {
         PX var1 = this.P().id_private();
         if (var1 != null) {
            ((cb_3)id_import.id_class[id_protected[75]]).id_case(var1.id_throws(), var1.id_protected());
         }
      }
   }
}

package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gh_1 implements PP, rW_2 {
   public static Object[] id_class;
   private static String[] id_throws;
   public Object[] id_break;
   private static boolean[] id_case;
   private static byte[] id_catch;
   private static double[] id_private;
   private static short[] id_implements;

   public boolean id_byte() {
      return (Boolean)this.id_break[id_implements[244]];
   }

   private static void id_int() {
      id_catch = new byte[]{3, 2, 10, 10, 3, -1, 3, 2, 2, 2, 3, 2, 2, -3, 3, 2, 2, 3, 3, 2, 3, 14, 2, 3, 6, 7, 13, 3, 2};
   }

   public Gh_1(BO var1, a_1 var2) {
      this.id_extends();
      Boolean var7 = id_case[0];
      this.id_break[id_implements[0]] = var7;
      HashSet var8 = new HashSet();
      this.id_break[id_implements[1]] = var8;
      HashSet var9 = new HashSet();
      this.id_break[id_implements[2]] = var9;
      HashSet var10 = new HashSet();
      this.id_break[id_implements[3]] = var10;
      this.id_break[id_implements[4]] = var1;
      Ps_1 var12 = (Ps_1)var1.id_class[id_implements[5]];
      this.id_break[id_implements[6]] = var12;
      this.id_break[id_implements[7]] = var2;
      Integer var14 = Integer.valueOf(id_case[1]);
      this.id_break[id_implements[8]] = var14;
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      ((C_class)((BO)this.id_break[id_implements[210]]).id_class[id_implements[211]]).id_int().id_class();
   }

   private boolean id_class(rqj_3<Double, rfH_2> var1, double var2) {
      double var4 = (Double)var1.id_class();
      if (var4 > var2) {
         if (((a_1)this.id_break[id_implements[105]]).id_catch().get((Integer)this.id_break[id_implements[106]]) instanceof Gs_1) {
            rfH_2 var6 = ((a_1)this.id_break[id_implements[107]]).id_break().get((Integer)this.id_break[id_implements[108]] + id_case[41]);
            return Pu_1.id_break(((Ps_1)this.id_break[id_implements[109]]).id_catch(), var6) >= var2 ? id_case[42] : id_case[43];
         } else {
            return id_case[44];
         }
      } else {
         return id_case[45];
      }
   }

   private static boolean id_class(Ps_1 var0, rd_3 var1, rd_3 var2) {
      if (var2 instanceof GP && var2.id_byte().equals(var1.id_byte())) {
         return id_case[102];
      } else if (!EF.id_class(var0, var1.id_implements().id_break(var1.id_byte()))) {
         return id_case[103];
      } else if (var2 instanceof Gb_1 && var2.id_byte().id_break().equals(var1.id_byte())) {
         return id_case[104];
      } else {
         return var2 instanceof GB && C_class.id_instanceof().C.id_class[id_implements[208]] ? id_case[105] : id_case[106];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{46, -92, -43, -1, 69, -96, -90, 21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Gh_1 id_class(Gh_1 var1) {
      return var1 == null
         ? this.id_new()
         : GX.id_class((a_1)this.id_break[id_implements[218]], (a_1)var1.id_break[id_implements[219]], id_case[109]).map(var2 -> {
            if (!var2.id_protected().equals(var1.id_class().id_protected())) {
               throw new IllegalStateException();
            } else {
               Gh_1 var3 = new Gh_1((BO)this.id_break[id_implements[245]], var2);
               Integer var8 = (Integer)this.id_break[id_implements[246]];
               var3.id_break[id_implements[247]] = var8;
               Double var9 = (Double)this.id_break[id_implements[248]];
               var3.id_break[id_implements[249]] = var9;
               Integer var10 = (Integer)this.id_break[id_implements[250]];
               var3.id_break[id_implements[251]] = var10;
               Integer var11 = (Integer)this.id_break[id_implements[252]];
               var3.id_break[id_implements[253]] = var11;
               return var3;
            }
         }).orElseGet(this::id_new);
   }

   private rqj_3<Double, rfH_2> id_class(a_1 var1) {
      double var2 = id_private[5];
      rfH_2 var4 = null;

      for (rd_3 var6 : var1.id_catch()) {
         for (rfH_2 var8 : ((Ev_1)var6).id_volatile()) {
            double var9 = Pu_1.id_class(((Ps_1)this.id_break[id_implements[93]]).id_catch(), var8);
            if (var9 < var2 || var2 == id_private[6]) {
               var2 = var9;
               var4 = var8;
            }
         }
      }

      return new rqj_3<>(var2, var4);
   }

   private static boolean id_class(Ps_1 var0, rd_3 var1) {
      double var2 = Math.abs(
            (double)var1.id_byte().b_()
               * ((double)((Integer)var1.id_break().id_break[id_implements[204]]).intValue() + id_private[12] - var0.id_catch().Ps().id_protected)
         )
         + Math.abs(
            (double)var1.id_byte().d_()
               * ((double)((Integer)var1.id_break().id_break[id_implements[205]]).intValue() + id_private[13] - var0.id_catch().Ps().id_break)
         );
      if (var2 > id_private[14]) {
         return id_case[85];
      } else {
         rfH_2 var4 = var1.id_break().id_byte(var1.id_byte()).id_break(id_catch[15]);
         if (EF.id_case(var0, var4)) {
            return id_case[86];
         } else {
            double var5 = Math.abs((double)var1.id_byte().b_() * ((double)var4.b_() + id_private[15] - var0.id_catch().Ps().id_break))
               + Math.abs((double)var1.id_byte().d_() * ((double)var4.d_() + id_private[16] - var0.id_catch().Ps().id_protected));
            return var5 > id_private[17] ? id_case[87] : id_case[88];
         }
      }
   }

   @Override
   public a_1 id_class() {
      return (a_1)this.id_break[id_implements[237]];
   }

   private static boolean id_class(Ps_1 var0, Gb_1 var1, Gr_1 var2, rd_3 var3) {
      if (!(Boolean)C_class.id_instanceof().PY.id_class[id_implements[206]]) {
         return id_case[89];
      } else if (!var1.id_byte().equals(var2.id_byte().id_break())) {
         return id_case[90];
      } else if (var3.id_byte().b_() == var2.id_byte().b_() && var3.id_byte().d_() == var2.id_byte().d_()) {
         if (!EF.id_break(var0, var1.id_implements().id_case())) {
            return id_case[92];
         } else if (!EF.id_break(var0, var2.id_implements().id_case())) {
            return id_case[93];
         } else if (!((List)var2.id_new[id_implements[207]]).isEmpty()) {
            return id_case[94];
         } else {
            for (int var4 = id_case[95]; var4 < id_catch[16]; var4++) {
               for (int var5 = id_case[96]; var5 < id_catch[17]; var5++) {
                  Object var6 = var1.id_break().id_final(var5);
                  if (var4 == id_case[97]) {
                     var6 = ((rfH_2)var6).id_break(var1.id_byte());
                  }

                  if (!EF.id_case(var0, (rfH_2)var6)) {
                     return id_case[98];
                  }
               }
            }

            if (EF.id_throws(var0.id_case().id_byte(var1.id_break().id_final(id_catch[18])))) {
               return id_case[99];
            } else {
               return !EF.id_throws(var0.id_case().id_byte(var2.id_implements().id_final(id_catch[19]))) ? id_case[100] : id_case[101];
            }
         }
      } else {
         return id_case[91];
      }
   }

   private rqj_3<rjU_2, rfH_2> id_class(Gs_1 var1) {
      rfH_2 var2 = var1.id_byte();
      if (var2.c_() < id_catch[13]) {
         return null;
      } else if (!((List)var1.id_new[id_implements[186]]).isEmpty()) {
         return null;
      } else {
         rja_3 var3 = new rja_3(var2.b_(), id_case[80], var2.d_());

         int var4;
         label49:
         for (var4 = (Integer)this.id_break[id_implements[187]] + id_case[81];
            var4 < ((a_1)this.id_break[id_implements[188]]).id_class() - id_case[82] && var4 < this.id_break[id_implements[189]] + id_catch[14];
            var4++
         ) {
            rd_3 var5 = ((a_1)this.id_break[id_implements[190]]).id_catch().get(var4);
            if (!(var5 instanceof Gb_1) || !var3.equals(var5.id_byte())) {
               break;
            }

            for (int var6 = (Integer)var5.id_implements().id_break[id_implements[191]];
               var6 <= var1.id_break().id_break[id_implements[192]] + id_case[83];
               var6++
            ) {
               rfH_2 var7 = new rfH_2(
                  (Integer)var5.id_implements().id_break[id_implements[193]], var6, (Integer)var5.id_implements().id_break[id_implements[194]]
               );
               if (!EF.id_case((Ps_1)this.id_break[id_implements[195]], var7)) {
                  break label49;
               }
            }

            if (!EF.id_break((Ps_1)this.id_break[id_implements[196]], var5.id_implements().id_case())) {
               break;
            }
         }

         if (--var4 == (Integer)this.id_break[id_implements[197]]) {
            return null;
         } else {
            double var9 = (double)(var4 - (Integer)this.id_break[id_implements[198]]) - id_private[9];
            return new rqj_3<>(
               new rjU_2(
                  (double)var3.b_() * var9 + (double)((Integer)var1.id_implements().id_break[id_implements[199]]).intValue() + id_private[10],
                  (double)((Integer)var1.id_implements().id_break[id_implements[200]]).intValue(),
                  (double)var3.d_() * var9 + (double)((Integer)var1.id_implements().id_break[id_implements[201]]).intValue() + id_private[11]
               ),
               var1.id_implements()
                  .id_class(
                     var3.b_() * (var4 - (Integer)this.id_break[id_implements[202]]),
                     id_case[84],
                     var3.d_() * (var4 - (Integer)this.id_break[id_implements[203]])
                  )
            );
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1009643304;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3875544986571064132L;
   }

   @Override
   public int id_break() {
      return (Integer)this.id_break[id_implements[217]];
   }

   public boolean id_throws() {
      if ((Integer)this.id_break[id_implements[9]] == ((a_1)this.id_break[id_implements[10]]).id_class() - id_case[2]) {
         Integer var14 = (Integer)this.id_break[id_implements[11]] + id_case[3];
         this.id_break[id_implements[12]] = var14;
      }

      if ((Integer)this.id_break[id_implements[13]] >= ((a_1)this.id_break[id_implements[14]]).id_class()) {
         return id_case[4];
      } else {
         Ev_1 var1 = (Ev_1)((a_1)this.id_break[id_implements[15]]).id_catch().get((Integer)this.id_break[id_implements[16]]);
         rU_2 var2 = ((Ps_1)this.id_break[id_implements[17]]).id_volatile();
         if (!var1.id_volatile().contains(var2)) {
            for (int var3 = id_case[5]; var3 < this.id_break[id_implements[18]] && var3 < ((a_1)this.id_break[id_implements[19]]).id_class(); var3++) {
               if (((Ev_1)((a_1)this.id_break[id_implements[20]]).id_catch().get(var3)).id_volatile().contains(var2)) {
                  int var4 = (Integer)this.id_break[id_implements[21]];
                  Integer var15 = var3;
                  this.id_break[id_implements[22]] = var15;

                  for (int var5 = (Integer)this.id_break[id_implements[23]]; var5 <= var4; var5++) {
                     ((a_1)this.id_break[id_implements[24]]).id_catch().get(var5).id_class();
                  }

                  this.id_continue();
                  this.id_throws();
                  return id_case[6];
               }
            }

            for (int var31 = (Integer)this.id_break[id_implements[25]] + id_catch[0];
               var31 < ((a_1)this.id_break[id_implements[26]]).id_class() - id_case[7];
               var31++
            ) {
               if (((Ev_1)((a_1)this.id_break[id_implements[27]]).id_catch().get(var31)).id_volatile().contains(var2)) {
                  if (var31 - (Integer)this.id_break[id_implements[28]] > id_catch[1]) {
                     this.id_byte("Skipping forward " + (var31 - (Integer)this.id_break[id_implements[29]]) + " steps, to " + var31);
                  }

                  Integer var16 = var31 - id_case[8];
                  this.id_break[id_implements[30]] = var16;
                  this.id_continue();
                  this.id_throws();
                  return id_case[9];
               }
            }
         }

         rqj_3 var32 = this.id_class((a_1)this.id_break[id_implements[31]]);
         if (this.id_class(var32, id_private[0])) {
            Integer var17 = (Integer)this.id_break[id_implements[32]] + id_case[10];
            this.id_break[id_implements[33]] = var17;
            System.out
               .println(
                  "FAR AWAY FROM PATH FOR " + (Integer)this.id_break[id_implements[34]] + " TICKS. Current distance: " + var32.id_class() + ". Threshold: 2.0"
               );
            if ((double)((Integer)this.id_break[id_implements[35]]).intValue() > id_private[1]) {
               this.id_byte(id_throws[0]);
               this.id_native();
               return id_case[11];
            }
         } else {
            Integer var18 = Integer.valueOf(id_case[12]);
            this.id_break[id_implements[36]] = var18;
         }

         if (this.id_class(var32, id_private[2])) {
            this.id_byte(id_throws[1]);
            this.id_native();
            return id_case[13];
         } else {
            bw_3 var33 = new bw_3((Ps_1)this.id_break[id_implements[37]]);

            for (int var34 = (Integer)this.id_break[id_implements[38]] - id_catch[2]; var34 < this.id_break[id_implements[39]] + id_catch[3]; var34++) {
               if (var34 >= 0 && var34 < ((a_1)this.id_break[id_implements[40]]).id_catch().size()) {
                  Ev_1 var6 = (Ev_1)((a_1)this.id_break[id_implements[41]]).id_catch().get(var34);
                  List var7 = var6.id_class(var33);
                  List var8 = var6.id_break(var33);
                  List var9 = var6.id_byte(var33);
                  var6.id_private();
                  if (!var7.equals(var6.id_class(var33))) {
                     Boolean var19 = id_case[14];
                     this.id_break[id_implements[42]] = var19;
                  }

                  if (!var8.equals(var6.id_break(var33))) {
                     Boolean var20 = id_case[15];
                     this.id_break[id_implements[43]] = var20;
                  }

                  if (!var9.equals(var6.id_byte(var33))) {
                     Boolean var21 = id_case[16];
                     this.id_break[id_implements[44]] = var21;
                  }
               }
            }

            if ((Boolean)this.id_break[id_implements[45]]) {
               HashSet var35 = new HashSet();
               HashSet var38 = new HashSet();
               HashSet var41 = new HashSet();

               for (int var42 = (Integer)this.id_break[id_implements[46]]; var42 < ((a_1)this.id_break[id_implements[47]]).id_catch().size(); var42++) {
                  Ev_1 var44 = (Ev_1)((a_1)this.id_break[id_implements[48]]).id_catch().get(var42);
                  var35.addAll(var44.id_class(var33));
                  var38.addAll(var44.id_break(var33));
                  var41.addAll(var44.id_byte(var33));
               }

               this.id_break[id_implements[49]] = var35;
               this.id_break[id_implements[50]] = var38;
               this.id_break[id_implements[51]] = var41;
               Boolean var25 = id_case[17];
               this.id_break[id_implements[52]] = var25;
            }

            if ((Integer)this.id_break[id_implements[53]] < ((a_1)this.id_break[id_implements[54]]).id_catch().size() - id_case[18]) {
               rd_3 var36 = ((a_1)this.id_break[id_implements[55]]).id_catch().get((Integer)this.id_break[id_implements[56]] + id_case[19]);
               if (!((bw_3)((C_class)((BO)this.id_break[id_implements[57]]).id_class[id_implements[58]]).id_break[id_implements[59]])
                  .id_class((Integer)var36.id_implements().id_break[id_implements[60]], (Integer)var36.id_implements().id_break[id_implements[61]])) {
                  this.id_byte(id_throws[2]);
                  this.id_this();
                  return id_case[20];
               }
            }

            boolean var37 = var1.id_protected();
            if ((Integer)this.id_break[id_implements[62]] == null || (Integer)this.id_break[id_implements[63]] != (Integer)this.id_break[id_implements[64]]) {
               Integer var26 = (Integer)this.id_break[id_implements[65]];
               this.id_break[id_implements[66]] = var26;
               Double var27 = var1.id_throws();
               this.id_break[id_implements[67]] = var27;
               if (C_class.id_instanceof().id_case()) {
                  for (int var39 = id_case[21];
                     var39 < C_class.id_instanceof().ru.id_class[id_implements[68]]
                        && this.id_break[id_implements[69]] + var39 < ((a_1)this.id_break[id_implements[70]]).id_class() - id_case[22];
                     var39++
                  ) {
                     if (((Ev_1)((a_1)this.id_break[id_implements[71]]).id_catch().get((Integer)this.id_break[id_implements[72]] + var39))
                              .id_class(((BO)this.id_break[id_implements[73]]).id_continue())
                           >= id_private[3]
                        && var37) {
                        this.id_byte(id_throws[3]);
                        this.id_native();
                        return id_case[23];
                     }
                  }
               }
            }

            double var40 = var1.id_protected(((BO)this.id_break[id_implements[74]]).id_continue());
            if (var40 >= id_private[4] && var37) {
               this.id_byte(id_throws[4]);
               this.id_native();
               return id_case[24];
            } else if (!var1.id_case()
               && var40 - (Double)this.id_break[id_implements[75]] > (Double)C_class.id_instanceof().u.id_class[id_implements[76]]
               && var37) {
               this.id_byte("Original cost " + (Double)this.id_break[id_implements[77]] + " current cost " + var40 + ". Cancelling.");
               this.id_native();
               return id_case[25];
            } else if (this.id_volatile()) {
               this.id_byte(id_throws[5]);
               this.id_this();
               return id_case[26];
            } else {
               rk_3 var43 = var1.id_catch();
               if (var43 == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_implements[78]]
                  || var43 == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_implements[79]]) {
                  this.id_byte("Movement returns status " + var43);
                  this.id_native();
                  return id_case[27];
               } else if (var43 == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_implements[80]]) {
                  Integer var28 = (Integer)this.id_break[id_implements[81]] + id_case[28];
                  this.id_break[id_implements[82]] = var28;
                  this.id_continue();
                  this.id_throws();
                  return id_case[29];
               } else {
                  Boolean var29 = this.id_synchronized();
                  this.id_break[id_implements[83]] = var29;
                  if (!(Boolean)this.id_break[id_implements[84]]) {
                     ((Ps_1)this.id_break[id_implements[85]]).id_catch().c_(id_case[30]);
                  }

                  Integer var30 = (Integer)this.id_break[id_implements[86]] + id_case[31];
                  this.id_break[id_implements[87]] = var30;
                  if ((double)((Integer)this.id_break[id_implements[88]]).intValue()
                     > (Double)this.id_break[id_implements[89]] + (double)((Integer)C_class.id_instanceof().id_default.id_class[id_implements[90]]).intValue()) {
                     this.id_byte(
                        "This movement has taken too long ("
                           + (Integer)this.id_break[id_implements[91]]
                           + " ticks, expected "
                           + (Double)this.id_break[id_implements[92]]
                           + "). Cancelling."
                     );
                     this.id_native();
                     return id_case[32];
                  } else {
                     return var37;
                  }
               }
            }
         }
      }
   }

   public Set<rfH_2> id_finally() {
      return Collections.unmodifiableSet((HashSet)this.id_break[id_implements[243]]);
   }

   public Set<rfH_2> id_catch() {
      return Collections.unmodifiableSet((HashSet)this.id_break[id_implements[241]]);
   }

   private void id_extends() {
      if (this.id_break == null) {
         this.id_break = new Object[id_catch[21]];
         Object[] var1 = this.id_break;
         var1[id_case[113]] = Integer.valueOf(id_case[114]);
         var1[id_catch[22]] = Integer.valueOf(id_case[115]);
         var1[id_catch[23]] = Integer.valueOf(id_case[116]);
         var1[id_catch[24]] = id_case[117];
         var1[id_catch[25]] = id_case[118];
         var1[id_catch[26]] = id_case[119];
      }
   }

   public Set<rfH_2> id_case() {
      return Collections.unmodifiableSet((HashSet)this.id_break[id_implements[242]]);
   }

   private void id_continue() {
      this.id_this();
      Integer var5 = Integer.valueOf(id_case[107]);
      this.id_break[id_implements[209]] = var5;
   }

   private static void id_else() {
      Object[] var0 = new Object[]{3.0, 2.0, 200.0};
      id_class = var0;
   }

   public boolean id_implements() {
      if (!((Ps_1)this.id_break[id_implements[110]]).id_catch().BL()
         && ((Ps_1)this.id_break[id_implements[111]]).id_case().id_break(((Ps_1)this.id_break[id_implements[112]]).id_volatile()).id_byte()) {
         return id_case[46];
      } else if (((Ps_1)this.id_break[id_implements[113]]).id_catch().rv().id_byte < id_private[7]) {
         return id_case[47];
      } else {
         int var1 = ((a_1)this.id_break[id_implements[114]]).id_break().indexOf(((Ps_1)this.id_break[id_implements[115]]).id_volatile());
         if (var1 == id_catch[5]) {
            return id_case[48];
         } else {
            Integer var6 = var1;
            this.id_break[id_implements[116]] = var6;
            this.id_this();
            return id_case[49];
         }
      }
   }

   private Gh_1 id_new() {
      if ((Integer)this.id_break[id_implements[220]] > (Integer)C_class.id_instanceof().Pk.id_class[id_implements[221]]) {
         int var1 = (Integer)C_class.id_instanceof().id_void.id_class[id_implements[222]];
         GO var2 = new GO((a_1)this.id_break[id_implements[223]], var1, ((a_1)this.id_break[id_implements[224]]).id_class() - id_case[110]);
         if (!var2.id_protected().equals(((a_1)this.id_break[id_implements[225]]).id_protected())) {
            throw new IllegalStateException();
         } else {
            this.id_byte(
               "Discarding earliest segment movements, length cut from " + ((a_1)this.id_break[id_implements[226]]).id_class() + " to " + var2.id_class()
            );
            Gh_1 var3 = new Gh_1((BO)this.id_break[id_implements[227]], var2);
            Integer var8 = (Integer)this.id_break[id_implements[228]] - var1;
            var3.id_break[id_implements[229]] = var8;
            Double var9 = (Double)this.id_break[id_implements[230]];
            var3.id_break[id_implements[231]] = var9;
            if ((Integer)this.id_break[id_implements[232]] != null) {
               Integer var10 = (Integer)this.id_break[id_implements[233]] - var1;
               var3.id_break[id_implements[234]] = var10;
            }

            Integer var11 = (Integer)this.id_break[id_implements[235]];
            var3.id_break[id_implements[236]] = var11;
            return var3;
         }
      } else {
         return this;
      }
   }

   private static void id_package() {
      id_private = new double[]{2.0, 200.0, 3.0, 1000000.0, 1000000.0, -1.0, -1.0, -0.1, 0.07, 0.4, 0.5, 0.5, 0.5, 0.5, 0.1, 0.5, 0.5, 0.8, 3.0, 2.0, 200.0};
   }

   private static void id_return() {
      id_case = new boolean[]{
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
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
         true,
         true,
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
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
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
         false,
         true,
         true,
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
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
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
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   private static void id_super() {
      id_implements = new short[]{
         7,
         8,
         9,
         10,
         11,
         1,
         12,
         0,
         1,
         1,
         0,
         1,
         1,
         1,
         0,
         0,
         1,
         12,
         1,
         0,
         0,
         1,
         1,
         1,
         0,
         1,
         0,
         0,
         1,
         1,
         1,
         0,
         2,
         2,
         2,
         2,
         2,
         12,
         1,
         1,
         0,
         0,
         7,
         7,
         7,
         7,
         1,
         0,
         0,
         8,
         9,
         10,
         7,
         1,
         0,
         0,
         1,
         11,
         0,
         34,
         0,
         2,
         5,
         5,
         1,
         1,
         5,
         4,
         0,
         1,
         0,
         0,
         1,
         11,
         11,
         4,
         0,
         4,
         4,
         5,
         3,
         1,
         1,
         13,
         13,
         12,
         3,
         3,
         3,
         4,
         0,
         3,
         4,
         12,
         11,
         12,
         12,
         12,
         12,
         12,
         12,
         12,
         0,
         1,
         12,
         0,
         1,
         0,
         1,
         12,
         12,
         12,
         12,
         12,
         0,
         12,
         1,
         11,
         0,
         8,
         11,
         0,
         8,
         11,
         0,
         8,
         0,
         1,
         1,
         0,
         0,
         1,
         12,
         0,
         1,
         12,
         1,
         1,
         11,
         0,
         6,
         1,
         0,
         0,
         1,
         12,
         11,
         0,
         1,
         0,
         0,
         1,
         1,
         1,
         12,
         1,
         0,
         0,
         1,
         12,
         12,
         1,
         1,
         1,
         0,
         1,
         12,
         11,
         0,
         6,
         1,
         0,
         12,
         0,
         1,
         0,
         12,
         0,
         1,
         11,
         0,
         12,
         12,
         11,
         0,
         0,
         8,
         1,
         0,
         1,
         0,
         1,
         1,
         0,
         2,
         12,
         12,
         1,
         1,
         0,
         1,
         2,
         1,
         1,
         2,
         0,
         0,
         8,
         0,
         3,
         11,
         0,
         11,
         0,
         0,
         1,
         6,
         1,
         0,
         0,
         1,
         0,
         0,
         0,
         0,
         0,
         0,
         11,
         1,
         1,
         4,
         4,
         5,
         5,
         5,
         3,
         3,
         0,
         6,
         1,
         0,
         8,
         9,
         10,
         13,
         11,
         1,
         1,
         4,
         4,
         5,
         5,
         3,
         3
      };
   }

   public boolean id_protected() {
      return this.id_break[id_implements[239]] >= ((a_1)this.id_break[id_implements[240]]).id_class() ? id_case[111] : id_case[112];
   }

   public boolean id_private() {
      return (Boolean)this.id_break[id_implements[238]];
   }

   private static void id_final() {
      id_throws = new String[]{
         new String("Too far away from path for too long, cancelling path"),
         new String("too far from path"),
         new String("Pausing since destination is at edge of loaded chunks"),
         new String("Something has changed in the world and a future movement has become impossible. Cancelling."),
         new String("Something has changed in the world and this movement has become impossible. Cancelling."),
         new String("Pausing since current best path is a backtrack"),
         new String("Skipping traverse to straight ascend"),
         new String("Too far to the side to safely sprint ascend"),
         new String("Sprinting would be unsafe"),
         new String("Skipping descend to straight ascend")
      };
   }

   private boolean id_volatile() {
      Optional var1 = ((BO)this.id_break[id_implements[94]]).id_case();
      if (!var1.isPresent()) {
         return id_case[33];
      } else if (!((Ps_1)this.id_break[id_implements[95]]).id_catch().BL()) {
         return id_case[34];
      } else if (!EF.id_break((Ps_1)this.id_break[id_implements[96]], ((Ps_1)this.id_break[id_implements[97]]).id_volatile().id_case())) {
         return id_case[35];
      } else if (!EF.id_class((Ps_1)this.id_break[id_implements[98]], ((Ps_1)this.id_break[id_implements[99]]).id_volatile())
         || !EF.id_class((Ps_1)this.id_break[id_implements[100]], ((Ps_1)this.id_break[id_implements[101]]).id_volatile().id_class())) {
         return id_case[36];
      } else if (!((a_1)this.id_break[id_implements[102]]).id_catch().get((Integer)this.id_break[id_implements[103]]).id_protected()) {
         return id_case[37];
      } else {
         Optional var2 = ((EW)var1.get()).id_class();
         if (!var2.isPresent()) {
            return id_case[38];
         } else {
            List var3 = ((a_1)var2.get()).id_break();
            if (var3.size() < id_catch[4]) {
               return id_case[39];
            } else {
               var3 = var3.subList(id_case[40], var3.size());
               return var3.contains(((Ps_1)this.id_break[id_implements[104]]).id_volatile());
            }
         }
      }
   }

   private boolean id_synchronized() {
      boolean var1 = ((C_class)((BO)this.id_break[id_implements[117]]).id_class[id_implements[118]])
         .id_int()
         .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[119]]);
      ((C_class)((BO)this.id_break[id_implements[120]]).id_class[id_implements[121]])
         .id_int()
         .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[122]], id_case[50]);
      if (!(Boolean)(new EZ((C_class)((BO)this.id_break[id_implements[123]]).id_class[id_implements[124]], id_case[51])).id_break[id_implements[125]]) {
         return id_case[52];
      } else {
         rd_3 var2 = ((a_1)this.id_break[id_implements[126]]).id_catch().get((Integer)this.id_break[id_implements[127]]);
         if (var2 instanceof Gb_1 && (Integer)this.id_break[id_implements[128]] < ((a_1)this.id_break[id_implements[129]]).id_class() - id_catch[6]) {
            rd_3 var3 = ((a_1)this.id_break[id_implements[130]]).id_catch().get((Integer)this.id_break[id_implements[131]] + id_case[53]);
            if (var3 instanceof Gr_1
               && id_class(
                  (Ps_1)this.id_break[id_implements[132]],
                  (Gb_1)var2,
                  (Gr_1)var3,
                  ((a_1)this.id_break[id_implements[133]]).id_catch().get((Integer)this.id_break[id_implements[134]] + id_catch[7])
               )) {
               if (id_class((Ps_1)this.id_break[id_implements[135]], var2)) {
                  this.id_byte(id_throws[6]);
                  Integer var10 = (Integer)this.id_break[id_implements[136]] + id_case[54];
                  this.id_break[id_implements[137]] = var10;
                  this.id_continue();
                  this.id_throws();
                  ((C_class)((BO)this.id_break[id_implements[138]]).id_class[id_implements[139]])
                     .id_int()
                     .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[140]], id_case[55]);
                  return id_case[56];
               }

               this.id_byte(id_throws[7]);
            }
         }

         if (var1) {
            return id_case[57];
         } else {
            if (var2 instanceof GP) {
               if ((Integer)this.id_break[id_implements[141]] < ((a_1)this.id_break[id_implements[142]]).id_class() - id_catch[8]) {
                  rd_3 var14 = ((a_1)this.id_break[id_implements[143]]).id_catch().get((Integer)this.id_break[id_implements[144]] + id_case[58]);
                  if (EF.id_break((Ps_1)this.id_break[id_implements[145]], (rfH_2)var14.id_implements().id_case())
                     && (var14 instanceof Gb_1 || var14 instanceof GE)) {
                     boolean var4 = C_class.id_instanceof().id_byte()
                           && ((C_class)((BO)this.id_break[id_implements[146]]).id_class[id_implements[147]]).id_static().id_class()
                           && var14 instanceof GE
                        ? id_case[59]
                        : id_case[60];
                     boolean var5 = !var2.id_byte().id_final().id_break(var14.id_byte()).equals(rfH_2.id_protected)
                           && var2.id_byte().id_final().id_protected(var14.id_byte()).equals(rfH_2.id_protected)
                        ? id_case[61]
                        : id_case[62];
                     if (var5 && !var4) {
                        ((GP)var2).id_int();
                     }
                  }
               }

               if (((GP)var2).id_new() && !((GP)var2).id_package()) {
                  this.id_byte(id_throws[8]);
                  return id_case[63];
               }

               if ((Integer)this.id_break[id_implements[148]] < ((a_1)this.id_break[id_implements[149]]).id_class() - id_catch[9]) {
                  rd_3 var15 = ((a_1)this.id_break[id_implements[150]]).id_catch().get((Integer)this.id_break[id_implements[151]] + id_case[64]);
                  if (var15 instanceof Gr_1 && var2.id_byte().id_final().equals(var15.id_byte().id_break())) {
                     Integer var11 = (Integer)this.id_break[id_implements[152]] + id_case[65];
                     this.id_break[id_implements[153]] = var11;
                     this.id_continue();
                     this.id_throws();
                     this.id_byte(id_throws[9]);
                     return id_case[66];
                  }

                  if (id_class((Ps_1)this.id_break[id_implements[154]], var2, var15)) {
                     if (var15 instanceof GP && (Integer)this.id_break[id_implements[155]] < ((a_1)this.id_break[id_implements[156]]).id_class() - id_catch[10]
                        )
                      {
                        rd_3 var20 = ((a_1)this.id_break[id_implements[157]]).id_catch().get((Integer)this.id_break[id_implements[158]] + id_catch[11]);
                        if (var20 instanceof GP && !id_class((Ps_1)this.id_break[id_implements[159]], var15, var20)) {
                           return id_case[67];
                        }
                     }

                     if (((Ps_1)this.id_break[id_implements[160]]).id_volatile().equals(var2.id_implements())) {
                        Integer var12 = (Integer)this.id_break[id_implements[161]] + id_case[68];
                        this.id_break[id_implements[162]] = var12;
                        this.id_continue();
                        this.id_throws();
                     }

                     return id_case[69];
                  }
               }
            }

            if (var2 instanceof Gr_1 && (Integer)this.id_break[id_implements[163]] != 0) {
               rd_3 var16 = ((a_1)this.id_break[id_implements[164]]).id_catch().get((Integer)this.id_break[id_implements[165]] - id_case[70]);
               if (var16 instanceof GP && var16.id_byte().id_final().equals(var2.id_byte().id_break())) {
                  rU_2 var18 = var2.id_break().id_class();
                  if (((Ps_1)this.id_break[id_implements[166]]).id_catch().Ps().id_byte >= (double)var18.c_() - id_private[8]) {
                     ((C_class)((BO)this.id_break[id_implements[167]]).id_class[id_implements[168]])
                        .id_int()
                        .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[169]], id_case[71]);
                     return id_case[72];
                  }
               }

               if ((Integer)this.id_break[id_implements[170]] < ((a_1)this.id_break[id_implements[171]]).id_class() - id_catch[12]
                  && var16 instanceof Gb_1
                  && id_class(
                     (Ps_1)this.id_break[id_implements[172]],
                     (Gb_1)var16,
                     (Gr_1)var2,
                     ((a_1)this.id_break[id_implements[173]]).id_catch().get((Integer)this.id_break[id_implements[174]] + id_case[73])
                  )) {
                  return id_case[74];
               }
            }

            if (var2 instanceof Gs_1) {
               rqj_3 var17 = this.id_class((Gs_1)var2);
               if (var17 != null) {
                  rU_2 var19 = new rU_2((rfH_2)var17.id_break());
                  if (!((a_1)this.id_break[id_implements[175]]).id_break().contains(var19)) {
                     throw new IllegalStateException();
                  }

                  if (((Ps_1)this.id_break[id_implements[176]]).id_volatile().equals(var19)) {
                     Integer var13 = ((a_1)this.id_break[id_implements[177]]).id_break().indexOf(var19);
                     this.id_break[id_implements[178]] = var13;
                     this.id_continue();
                     this.id_throws();
                     return id_case[75];
                  }

                  this.id_this();
                  ((C_class)((BO)this.id_break[id_implements[179]]).id_class[id_implements[180]])
                     .id_private()
                     .id_class(
                        PJ.id_class(
                           ((Ps_1)this.id_break[id_implements[181]]).id_finally(),
                           (rjU_2)var17.id_class(),
                           ((Ps_1)this.id_break[id_implements[182]]).id_protected()
                        ),
                        id_case[76]
                     );
                  ((C_class)((BO)this.id_break[id_implements[183]]).id_class[id_implements[184]])
                     .id_int()
                     .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[185]], id_case[77]);
                  return id_case[78];
               }
            }

            return id_case[79];
         }
      }
   }

   private void id_native() {
      this.id_this();
      ((C_class)((BO)this.id_break[id_implements[212]]).id_class[id_implements[213]]).id_int().id_break().id_class();
      Integer var5 = ((a_1)this.id_break[id_implements[214]]).id_class() + id_catch[20];
      this.id_break[id_implements[215]] = var5;
      Boolean var6 = id_case[108];
      this.id_break[id_implements[216]] = var6;
   }
}

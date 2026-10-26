package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import org.apache.commons.lang3.mutable.MutableObject;

final class rez_3 {
   private final rVL<reu_3> class_;
   private final int break_;
   private final reN_2 byte_;
   private final rKd_1 protected_;
   private final rrPt_1 throws_;
   private final List<? super rel_3> case_;
   private final Random catch_;
   final Deque<reQ_2> private_ = Queues.newArrayDeque();

   rez_3(rVL<reu_3> var1, int var2, reN_2 var3, rKd_1 var4, rrPt_1 var5, List<? super rel_3> var6, Random var7) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
   }

   void class_(rel_3 var1, MutableObject<rjC_2> var2, int var3, int var4, boolean var5) {
      rev_3 var6 = var1.break_();
      rfH_2 var7 = var1.byte_();
      rqd_3 var8 = var1.class_();
      rem_3 var9 = var6.byte_();
      boolean var10 = var9 == rem_3.RIGID;
      MutableObject var11 = new MutableObject();
      rfi_3 var12 = var1.catch_();
      int var13 = var12.break_;

      label138:
      for (rrPp_1 var15 : var6.class_(this.throws_, var7, var8, this.catch_)) {
         rpr_3 var16 = kW_2.private_(var15.break_);
         rfH_2 var17 = var15.class_;
         rfH_2 var18 = var17.break_(var16);
         int var19 = var17.c_() - var13;
         int var20 = -1;
         rqO_2 var21 = new rqO_2(var15.byte_.native_("pool"));
         Optional var22 = this.class_.break_(var21);
         if (var22.isPresent() && (((reu_3)var22.get()).byte_() != 0 || Objects.equals(var21, reZ_2.class_.class_()))) {
            rqO_2 var23 = ((reu_3)var22.get()).class_();
            Optional var24 = this.class_.break_(var23);
            if (var24.isPresent() && (((reu_3)var24.get()).byte_() != 0 || Objects.equals(var23, reZ_2.class_.class_()))) {
               boolean var25 = var12.break_(var18);
               MutableObject var26;
               int var27;
               if (var25) {
                  var26 = var11;
                  var27 = var13;
                  if (var11.getValue() == null) {
                     var11.setValue(rjw_3.class_(rfl_3.class_(var12)));
                  }
               } else {
                  var26 = var2;
                  var27 = var3;
               }

               ArrayList var28 = Lists.newArrayList();
               if (var4 != this.break_) {
                  var28.addAll(((reu_3)var22.get()).break_(this.catch_));
               }

               var28.addAll(((reu_3)var24.get()).break_(this.catch_));

               for (rev_3 var30 : var28) {
                  if (var30 == reJ_2.break_) {
                     break;
                  }

                  for (rqd_3 var32 : rqd_3.break_(this.catch_)) {
                     List var33 = var30.class_(this.throws_, rfH_2.protected_, var32, this.catch_);
                     rfi_3 var34 = var30.class_(this.throws_, rfH_2.protected_, var32);
                     int var35;
                     if (var5 && var34.throws_() <= 16) {
                        var35 = var33.stream().mapToInt(var2x -> {
                           if (!var34.break_(var2x.class_.break_(kW_2.private_(var2x.break_)))) {
                              return 0;
                           } else {
                              rqO_2 var3x = new rqO_2(var2x.byte_.native_("pool"));
                              Optional var4x = this.class_.break_(var3x);
                              Optional var5x = var4x.flatMap(var1xx -> this.class_.break_(var1xx.class_()));
                              int var6x = var4x.<Integer>map(var1xx -> var1xx.class_(this.throws_)).orElse(0);
                              int var7x = var5x.<Integer>map(var1xx -> var1xx.class_(this.throws_)).orElse(0);
                              return Math.max(var6x, var7x);
                           }
                        }).max().orElse(0);
                     } else {
                        var35 = 0;
                     }

                     for (rrPp_1 var37 : var33) {
                        if (kW_2.class_(var15, var37)) {
                           rfH_2 var38 = var37.class_;
                           rfH_2 var39 = new rfH_2(var18.b_() - var38.b_(), var18.c_() - var38.c_(), var18.d_() - var38.d_());
                           rfi_3 var40 = var30.class_(this.throws_, var39, var32);
                           int var41 = var40.break_;
                           rem_3 var42 = var30.byte_();
                           boolean var43 = var42 == rem_3.RIGID;
                           int var44 = var38.c_();
                           int var45 = var19 - var44 + kW_2.private_(var15.break_).finally_();
                           int var46;
                           if (var10 && var43) {
                              var46 = var13 + var45;
                           } else {
                              if (var20 == -1) {
                                 var20 = this.protected_.break_(var17.b_(), var17.d_(), rKv_1.WORLD_SURFACE_WG);
                              }

                              var46 = var20 - var44;
                           }

                           int var47 = var46 - var41;
                           rfi_3 var48 = var40.break_(0, var47, 0);
                           rfH_2 var49 = var39.break_(0, var47, 0);
                           if (var35 > 0) {
                              int var50 = Math.max(var35 + 1, var48.throws_ - var48.break_);
                              var48.throws_ = var48.break_ + var50;
                           }

                           if (!rjw_3.byte_((rjC_2)var26.getValue(), rjw_3.class_(rfl_3.class_(var48).break_(0.25)), rjN_2.byte_)) {
                              var26.setValue(rjw_3.break_((rjC_2)var26.getValue(), rjw_3.class_(rfl_3.class_(var48)), rjN_2.throws_));
                              int var54 = var1.protected_();
                              int var51;
                              if (var43) {
                                 var51 = var54 - var45;
                              } else {
                                 var51 = var30.protected_();
                              }

                              rel_3 var52 = this.byte_.create(this.throws_, var30, var49, var51, var32, var48);
                              int var53;
                              if (var10) {
                                 var53 = var13 + var19;
                              } else if (var43) {
                                 var53 = var46 + var44;
                              } else {
                                 if (var20 == -1) {
                                    var20 = this.protected_.break_(var17.b_(), var17.d_(), rKv_1.WORLD_SURFACE_WG);
                                 }

                                 var53 = var20 + var45 / 2;
                              }

                              var1.class_(new rek_3(var18.b_(), var53 - var19 + var54, var18.d_(), var45, var42));
                              var52.class_(new rek_3(var17.b_(), var53 - var44 + var51, var17.d_(), -var45, var9));
                              this.case_.add(var52);
                              if (var4 + 1 <= this.break_) {
                                 this.private_.addLast(new reQ_2(var52, var26, var27, var4 + 1));
                              }
                              continue label138;
                           }
                        }
                     }
                  }
               }
            } else {
               reW_2.class_.warn("Empty or none existent fallback pool: {}", var23);
            }
         } else {
            reW_2.class_.warn("Empty or none existent pool: {}", var21);
         }
      }
   }
}

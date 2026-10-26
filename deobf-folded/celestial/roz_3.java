package celestial;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.BitSet;
import java.util.Map;
import java.util.stream.Stream;

public class roz_3 extends rok_3 {
   private final roJ_2 id_class;

   @Override
   public roQ_2[] id_byte() {
      return this.id_class.id_byte();
   }

   @Override
   public xc_3 id_byte(rfH_2 var1) {
      return this.id_class.id_byte(var1);
   }

   public roz_3(roJ_2 var1) {
      super(var1.id_private(), rVh_1.id_class);
      this.id_class = var1;
   }

   @Override
   public void id_class(rrrZ<?> var1, long var2) {
   }

   @Override
   public Map<rrrZ<?>, LongSet> id_class() {
      return this.id_class.id_class();
   }

   @Override
   public rrrH<?> id_class(rrrZ<?> var1) {
      return this.id_class.id_class(var1);
   }

   @Override
   public void id_class(rrrZ<?> var1, rrrH<?> var2) {
   }

   @Override
   public void id_class(long var1) {
   }

   @Override
   public BitSet id_class(rKu_1 var1) {
      throw (UnsupportedOperationException)rqR_2.id_byte(new UnsupportedOperationException("Meaningless in this context"));
   }

   @Override
   public void id_class(rYZ var1) {
   }

   @Override
   public void id_class(rcd_3 var1) {
   }

   @Override
   public void id_class(Map<rrrZ<?>, LongSet> var1) {
   }

   @Override
   public void id_class(rKv_1 var1, long[] var2) {
   }

   @Override
   public void id_class(roN_2 var1) {
   }

   @Override
   public ryO_2 id_class(rfH_2 var1) {
      return this.id_class.id_class(var1);
   }

   @Override
   public void id_class(rfH_2 var1, ryO_2 var2) {
   }

   @Override
   public xc_3 id_class(rfH_2 var1, xc_3 var2, boolean var3) {
      return null;
   }

   @Override
   public void id_class(an_3 var1) {
   }

   @Override
   public int id_class(rKv_1 var1, int var2, int var3) {
      return this.id_class.id_class(this.id_break(var1), var2, var3);
   }

   private rKv_1 id_break(rKv_1 var1) {
      if (var1 == rKv_1.WORLD_SURFACE_WG) {
         return rKv_1.WORLD_SURFACE;
      } else {
         return var1 == rKv_1.OCEAN_FLOOR_WG ? rKv_1.OCEAN_FLOOR : var1;
      }
   }

   @Override
   public LongSet id_break(rrrZ<?> var1) {
      return this.id_class.id_break(var1);
   }

   @Override
   public rXE id_break(rfH_2 var1) {
      return this.id_class.id_break(var1);
   }

   @Override
   public BitSet id_break(rKu_1 var1) {
      throw (UnsupportedOperationException)rqR_2.id_byte(new UnsupportedOperationException("Meaningless in this context"));
   }

   @Override
   public void id_break(Map<rrrZ<?>, rrrH<?>> var1) {
   }

   @Override
   public void id_break(boolean var1) {
   }

   @Override
   public void id_throws(rfH_2 var1) {
   }

   @Override
   public roW_2<xd_3> id_finally() {
      return new roW_2<>(var0 -> var0.id_continue().id_catch(), this.id_private());
   }

   @Override
   public rrse_3 id_catch() {
      return this.id_class.id_protected();
   }

   @Override
   public roW_2<rXs_1> id_extends() {
      return new roW_2<>(var0 -> var0 == rXG.id_class, this.id_private());
   }

   @Override
   public void id_extends(rfH_2 var1) {
   }

   @Override
   public roN_2 id_goto() {
      return this.id_class.id_goto();
   }

   @Override
   public rcd_3 id_case(rfH_2 var1) {
      return this.id_class.id_case(var1);
   }

   @Override
   public boolean id_continue() {
      return false;
   }

   @Override
   public rYZ id_implements() {
      return this.id_class.id_implements();
   }

   @Override
   public Stream<rfH_2> id_package() {
      return this.id_class.id_package();
   }

   @Override
   public Map<rrrZ<?>, rrrH<?>> id_super() {
      return this.id_class.id_super();
   }

   @Override
   public boolean id_throw() {
      return this.id_class.id_throw();
   }

   @Override
   public int id_while() {
      return this.id_class.id_while();
   }

   @Override
   public rcd_3 id_protected(rfH_2 var1) {
      return this.id_class.id_protected(var1);
   }

   @Override
   public void id_protected(boolean var1) {
      this.id_class.id_protected(var1);
   }

   @Override
   public rfj_3 id_private() {
      return this.id_class.id_private();
   }

   public roJ_2 id_final() {
      return this.id_class;
   }
}

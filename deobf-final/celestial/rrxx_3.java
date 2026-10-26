package celestial;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class rrxx_3 implements Set<HU> {
   private boolean[] class_ = new boolean[HU.s.length];

   @Override
   public boolean remove(Object var1) {
      throw new UnsupportedOperationException("Not supported");
   }

   @Override
   public int size() {
      throw new UnsupportedOperationException("Not supported");
   }

   @Override
   public void clear() {
      throw new UnsupportedOperationException("Not supported");
   }

   @Override
   public boolean isEmpty() {
      throw new UnsupportedOperationException("Not supported");
   }

   @Override
   public <T> T[] toArray(T[] var1) {
      throw new UnsupportedOperationException("Not supported");
   }

   @Override
   public Object[] toArray() {
      throw new UnsupportedOperationException("Not supported");
   }

   @Override
   public Iterator<HU> iterator() {
      throw new UnsupportedOperationException("Not supported");
   }

   @Override
   public boolean contains(Object var1) {
      return var1 instanceof HU ? this.break_((HU)var1) : false;
   }

   public boolean class_(HU var1) {
      this.class_[var1.protected_()] = true;
      return false;
   }

   @Override
   public boolean addAll(Collection<? extends HU> var1) {
      throw new UnsupportedOperationException("Not supported");
   }

   public boolean break_(HU var1) {
      return this.class_[var1.protected_()];
   }

   @Override
   public boolean removeAll(Collection<?> var1) {
      throw new UnsupportedOperationException("Not supported");
   }

   @Override
   public boolean retainAll(Collection<?> var1) {
      throw new UnsupportedOperationException("Not supported");
   }

   @Override
   public boolean containsAll(Collection<?> var1) {
      throw new UnsupportedOperationException("Not supported");
   }
}

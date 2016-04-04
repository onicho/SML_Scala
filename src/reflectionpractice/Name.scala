package reflectionpractice

import reflect.runtime.currentMirror

/**
  * Created by ONicholls on 20/02/2016.
  */


trait Name {
  override def toString =
    Name.className(this)
}


object Name  {

  def className(o:Any) = currentMirror.reflect(o).symbol.
  toString.replace('$', ' ').
  split(' ').last

}


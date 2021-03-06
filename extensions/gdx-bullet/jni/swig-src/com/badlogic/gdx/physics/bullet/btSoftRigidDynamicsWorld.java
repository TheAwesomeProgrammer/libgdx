/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btSoftRigidDynamicsWorld extends btDiscreteDynamicsWorld {
  private long swigCPtr;

  protected btSoftRigidDynamicsWorld(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btSoftRigidDynamicsWorld_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btSoftRigidDynamicsWorld obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btSoftRigidDynamicsWorld(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btSoftRigidDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration, btSoftBodySolver softBodySolver) {
    this(gdxBulletJNI.new_btSoftRigidDynamicsWorld__SWIG_0(btDispatcher.getCPtr(dispatcher), dispatcher, btBroadphaseInterface.getCPtr(pairCache), pairCache, btConstraintSolver.getCPtr(constraintSolver), constraintSolver, btCollisionConfiguration.getCPtr(collisionConfiguration), collisionConfiguration, btSoftBodySolver.getCPtr(softBodySolver), softBodySolver), true);
  }

  public btSoftRigidDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration) {
    this(gdxBulletJNI.new_btSoftRigidDynamicsWorld__SWIG_1(btDispatcher.getCPtr(dispatcher), dispatcher, btBroadphaseInterface.getCPtr(pairCache), pairCache, btConstraintSolver.getCPtr(constraintSolver), constraintSolver, btCollisionConfiguration.getCPtr(collisionConfiguration), collisionConfiguration), true);
  }

  public void addSoftBody(btSoftBody body, short collisionFilterGroup, short collisionFilterMask) {
    gdxBulletJNI.btSoftRigidDynamicsWorld_addSoftBody__SWIG_0(swigCPtr, this, btSoftBody.getCPtr(body), body, collisionFilterGroup, collisionFilterMask);
  }

  public void addSoftBody(btSoftBody body, short collisionFilterGroup) {
    gdxBulletJNI.btSoftRigidDynamicsWorld_addSoftBody__SWIG_1(swigCPtr, this, btSoftBody.getCPtr(body), body, collisionFilterGroup);
  }

  public void addSoftBody(btSoftBody body) {
    gdxBulletJNI.btSoftRigidDynamicsWorld_addSoftBody__SWIG_2(swigCPtr, this, btSoftBody.getCPtr(body), body);
  }

  public void removeSoftBody(btSoftBody body) {
    gdxBulletJNI.btSoftRigidDynamicsWorld_removeSoftBody(swigCPtr, this, btSoftBody.getCPtr(body), body);
  }

  public int getDrawFlags() {
    return gdxBulletJNI.btSoftRigidDynamicsWorld_getDrawFlags(swigCPtr, this);
  }

  public void setDrawFlags(int f) {
    gdxBulletJNI.btSoftRigidDynamicsWorld_setDrawFlags(swigCPtr, this, f);
  }

  public btSoftBodyWorldInfo getWorldInfo() {
    return new btSoftBodyWorldInfo(gdxBulletJNI.btSoftRigidDynamicsWorld_getWorldInfo__SWIG_0(swigCPtr, this), false);
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t getSoftBodyArray() {
    return new SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t(gdxBulletJNI.btSoftRigidDynamicsWorld_getSoftBodyArray__SWIG_0(swigCPtr, this), false);
  }

  public static void rayTestSingle(Matrix4 rayFromTrans, Matrix4 rayToTrans, btCollisionObject collisionObject, btCollisionShape collisionShape, Matrix4 colObjWorldTransform, RayResultCallback resultCallback) {
    gdxBulletJNI.btSoftRigidDynamicsWorld_rayTestSingle(rayFromTrans, rayToTrans, btCollisionObject.getCPtr(collisionObject), collisionObject, btCollisionShape.getCPtr(collisionShape), collisionShape, colObjWorldTransform, RayResultCallback.getCPtr(resultCallback), resultCallback);
  }

}

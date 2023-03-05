import { IUser } from 'app/shared/model/user.model';

export interface ITask {
  id?: number;
  title?: string;
  text?: string;
  done?: boolean | null;
  user_task?: IUser;
}

export const defaultValue: Readonly<ITask> = {
  done: false,
};
